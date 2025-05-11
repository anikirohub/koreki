package watch.anikiro.koreki.model.auth;

import lombok.Data;

@Data
public class AuthLogoutRequest {
	private String refreshToken;
}
