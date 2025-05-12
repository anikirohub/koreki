package watch.anikiro.koreki.type;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public enum Country {
	// Europe
	AT("Austria"),
	BE("Belgium"),
	CH("Switzerland"),
	CZ("Czech Republic"),
	DE("Germany"),
	DK("Denmark"),
	ES("Spain"),
	FI("Finland"),
	FR("France"),
	GB("United Kingdom"),
	GR("Greece"),
	IE("Ireland"),
	IT("Italy"),
	NL("Netherlands"),
	NO("Norway"),
	PL("Poland"),
	PT("Portugal"),
	RU("Russia"),
	SE("Sweden"),
	UA("Ukraine"),

	// Asia
	AE("United Arab Emirates"),
	CN("China"),
	HK("Hong Kong"),
	ID("Indonesia"),
	IL("Israel"),
	IN("India"),
	JP("Japan"),
	KR("South Korea"),
	MY("Malaysia"),
	PH("Philippines"),
	PK("Pakistan"),
	SA("Saudi Arabia"),
	SG("Singapore"),
	TH("Thailand"),
	TR("Turkey"),
	TW("Taiwan"),
	VN("Vietnam"),

	// Americas
	AR("Argentina"),
	BR("Brazil"),
	CA("Canada"),
	CL("Chile"),
	CO("Colombia"),
	MX("Mexico"),
	PE("Peru"),
	US("United States"),

	// Africa
	EG("Egypt"),
	MA("Morocco"),
	NG("Nigeria"),
	ZA("South Africa"),

	// Oceania
	AU("Australia"),
	NZ("New Zealand");

	private final String displayName;
	private static final Map<String, Country> codeMap = new HashMap<>();

	static {
		for (Country country : values()) {
			codeMap.put(country.name(), country);
		}
	}

	Country(String displayName) {
		this.displayName = displayName;
	}

	public String getCode() {
		return name();
	}

	public static Country fromCode(String code) {
		Country country = codeMap.get(code);
		if (country == null)
			throw new IllegalArgumentException("Invalid country code: " + code);

		return country;
	}
}