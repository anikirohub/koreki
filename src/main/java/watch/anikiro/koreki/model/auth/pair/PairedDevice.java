package watch.anikiro.koreki.model.auth.pair;

import lombok.AllArgsConstructor;
import lombok.Data;
import watch.anikiro.koreki.model.auth.Session;

import java.time.Instant;

@Data
@AllArgsConstructor
public class PairedDevice {
	private final String deviceName;

	private final Instant pairedAt;
	private final Session session;
}