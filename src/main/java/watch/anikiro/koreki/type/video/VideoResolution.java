package watch.anikiro.koreki.type.video;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum VideoResolution {
    P144("144p"),
    P240("240p"),
    P360("360p"),
    P480("480p"),
    P720("HD"),
    P1080("FULL HD"),
    P1440("2K"),
    P2160("4K");

    private final String label;
}
