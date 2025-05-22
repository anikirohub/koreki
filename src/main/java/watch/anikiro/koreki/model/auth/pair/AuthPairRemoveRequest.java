package watch.anikiro.koreki.model.auth.pair;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthPairRemoveRequest {
	private String deviceName;
	private String accessToken;
	private long pairedAt;
}
