package watch.anikiro.koreki.model.auth.pair;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthPairResponse {
	private String code;
	private long expiresAt;
	private long interval;
}
