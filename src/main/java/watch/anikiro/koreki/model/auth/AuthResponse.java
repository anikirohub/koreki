package watch.anikiro.koreki.model.auth;

import lombok.Data;

@Data
public class AuthResponse {
	private String accessToken;
	private int accessTokenExpiresIn;
	private String refreshToken;
	private int refreshTokenExpiresIn;
}
