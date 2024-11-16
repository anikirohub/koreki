package watch.anikiro.koreki.model.title;

import lombok.Data;
import watch.anikiro.koreki.type.title.TitleRating;
import watch.anikiro.koreki.type.title.TitleStatus;
import watch.anikiro.koreki.type.title.TitleType;

import java.util.Locale;
import java.util.Map;
import java.util.UUID;

@Data
public class Title {
    private final Long id;

    private int maxEpisodes;
    private boolean hidden;

    private UUID posterHash;
    private UUID trailerHash;

    private TitleStatus status;
    private TitleType type;
    private TitleRating rating;

    private Map<Locale, TitleDetails> details;

    /*
     * Additional information about the title.
     *
     * Can be null if wasn't fetched, because it's a resource-heavy operation.
     *
     * @since 0.0.1
     */
    private TitleInformation information;
}
