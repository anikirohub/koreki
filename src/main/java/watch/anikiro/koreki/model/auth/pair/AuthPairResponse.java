package watch.anikiro.koreki.model.auth.pair;

import lombok.Data;

@Data
public class AuthPairResponse {
	private String code;
	private long expiresIn;
	private long interval;
}
