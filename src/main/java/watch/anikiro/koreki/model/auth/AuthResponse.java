package watch.anikiro.koreki.model.auth;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AuthResponse {
	private String accessToken;
	private LocalDateTime expiresAt;
	private String refreshToken;
	private LocalDateTime tokenExpiresAt;
}
