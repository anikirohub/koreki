package watch.anikiro.koreki.model.auth;

import lombok.Data;

@Data
public class AuthRequest {
	private String username;
	private String password;
}
