package watch.anikiro.koreki.model.auth;

import lombok.Data;

@Data
public class AuthPairConfirmRequest {
	private String code;
	private String accessToken;
}
