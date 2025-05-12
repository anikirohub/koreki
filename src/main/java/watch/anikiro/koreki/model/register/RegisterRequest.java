package watch.anikiro.koreki.model.register;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import watch.anikiro.koreki.type.Country;

import java.time.LocalDate;
import java.util.Locale;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
	private String username;
	private String email;
	private String password;

	private String firstname;
	private String lastname;
	private boolean remember;

	private Preferences preferences;

	@Data
	public static class Preferences {
		private Locale locale;
		private Country country;
		private LocalDate birthday;
	}
}
