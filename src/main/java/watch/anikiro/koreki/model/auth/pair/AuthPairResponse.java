package watch.anikiro.koreki.model.auth.pair;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthPairResponse {
	private String code;
	private long expiresAt;
	private long interval;
}
