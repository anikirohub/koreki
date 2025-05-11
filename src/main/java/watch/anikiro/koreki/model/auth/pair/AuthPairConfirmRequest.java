package watch.anikiro.koreki.model.auth.pair;

import lombok.Data;

@Data
public class AuthPairConfirmRequest {
	private String code;
	private String username;
	private String password;
}
