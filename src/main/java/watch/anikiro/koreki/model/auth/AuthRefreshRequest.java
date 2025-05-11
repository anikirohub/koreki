package watch.anikiro.koreki.model.auth;

import lombok.Data;

@Data
public class AuthRefreshRequest {
	private String refreshToken;
}
