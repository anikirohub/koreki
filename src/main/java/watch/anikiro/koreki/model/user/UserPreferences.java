package watch.anikiro.koreki.model.user;

import lombok.Data;
import watch.anikiro.koreki.type.Privacy;
import watch.anikiro.koreki.type.video.VideoResolution;
import watch.anikiro.koreki.type.video.VideoSource;

import java.util.Locale;

@Data
public class UserPreferences {
    private Long id;
    private boolean skipOpenings;
    private boolean skipEndings;
    private boolean autoPlay;

    private VideoSource preferredSource;
    private VideoResolution preferredResolution;
    private Locale preferredLanguage;
    private Privacy preferredPrivacy;
}
