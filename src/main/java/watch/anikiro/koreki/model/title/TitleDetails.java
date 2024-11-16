package watch.anikiro.koreki.model.title;

import lombok.Data;

import java.util.List;
import java.util.Locale;

@Data
public class TitleDetails {
    private final Long id;
    private final Locale language;

    private String name;
    private List<String> aliases;

    private String description;
    private String shortDescription;
}
