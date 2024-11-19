package watch.anikiro.koreki.model.user;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class UserMeta {
    private Long id;
    private LocalDateTime joinedAt;
    private LocalDateTime lastSeen;

    private String ipAddress;
    private LocalDate birthday;

    private UUID avatarHash;
    private UUID bannerHash;
}
