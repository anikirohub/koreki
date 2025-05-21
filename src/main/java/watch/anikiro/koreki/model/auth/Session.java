package watch.anikiro.koreki.model.auth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Session {
	private String userId;
	private String refreshToken;
	private Instant expiresAt;
	private boolean offlineAccess;

	public static Session fromAuth(String userId, AuthResponse auth) {
		boolean offline = auth.getRefreshTokenExpiresIn() == 0;
		Instant expiresAt = offline
				? Instant.ofEpochMilli(Long.MAX_VALUE)
				: Instant.now().plusSeconds(auth.getRefreshTokenExpiresIn());

		return new Session(
				userId,
				auth.getRefreshToken(),
				expiresAt,
				offline
		);
	}
}