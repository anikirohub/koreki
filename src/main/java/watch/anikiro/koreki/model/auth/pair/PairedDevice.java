package watch.anikiro.koreki.model.auth.pair;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import watch.anikiro.koreki.model.auth.Session;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PairedDevice {
	private String deviceName;

	private Instant pairedAt;
	private Session session;
}