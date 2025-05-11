package watch.anikiro.koreki.model.auth.pair;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Instant;

@Data
@AllArgsConstructor
public class AuthPairResponse {
	private String code;
	private Instant expiresAt;
	private long interval;
}
