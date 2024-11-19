package watch.anikiro.koreki.model.title;

import lombok.Data;
import watch.anikiro.koreki.model.Genre;
import watch.anikiro.koreki.model.Publisher;

import java.util.Set;

@Data
public class TitleInformation {
    private Set<Genre> genres;
    private Set<Publisher> publishers;

    /*
     * The predecessor is the title that comes before this one.
     *
     * Can be null if there is no predecessor.
     *
     * @since 0.0.1
     */
    private Long predecessor;

    /*
     * The successor is the title that comes after this one.
     *
     * Can be null if there is no successor.
     *
     * @since 0.0.1
     */
    private Long successor;
}
