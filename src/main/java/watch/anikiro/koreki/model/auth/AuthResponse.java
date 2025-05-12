package watch.anikiro.koreki.model.auth;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {
	private String accessToken;
	private int accessTokenExpiresIn;
	private String refreshToken;
	private int refreshTokenExpiresIn;
}
