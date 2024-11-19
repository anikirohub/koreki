package watch.anikiro.koreki.model.title;

import lombok.Data;
import watch.anikiro.koreki.model.Genre;
import watch.anikiro.koreki.model.Publisher;

import java.util.List;
import java.util.Set;

@Data
public class TitleInformation {
    private Set<Genre> genres;
    private Set<Publisher> publishers;
    private List<Title> relations;
}
