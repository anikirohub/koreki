package watch.anikiro.koreki.model.auth;

import lombok.Data;

@Data
public class AuthPairRequest {
	private String code;
	private long expiresIn;
	private long interval;
}
