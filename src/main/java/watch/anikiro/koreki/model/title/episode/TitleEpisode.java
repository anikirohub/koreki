package watch.anikiro.koreki.model.title.episode;

import lombok.Data;
import watch.anikiro.koreki.model.AudioStudio;

import java.util.List;
import java.util.Locale;
import java.util.Map;

@Data
public class TitleEpisode {
    private Long id;
    private Long titleId;

    private int episode;

    private List<AudioStudio> audioStudios;
    private List<TitleEpisodeStorage> storages;
    private Map<Locale, String> subtitles;
}
