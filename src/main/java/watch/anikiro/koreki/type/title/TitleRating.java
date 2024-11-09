package watch.anikiro.koreki.type.title;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum TitleRating {
    G(0),
    PG(10),
    PG_13(13),
    R(17),
    R_PLUS(18);

    private final int minAge;
}
