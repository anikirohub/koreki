package watch.anikiro.koreki.model.title.episode;

import lombok.Data;
import watch.anikiro.koreki.type.video.VideoSource;

@Data
public class TitleEpisodeStorage {
    private Long id;

    private VideoSource source;
    private String context;
}
