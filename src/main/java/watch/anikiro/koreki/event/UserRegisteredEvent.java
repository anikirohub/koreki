package watch.anikiro.koreki.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRegisteredEvent {
	private String username;
	private String email;
	private Instant timestamp;
}
