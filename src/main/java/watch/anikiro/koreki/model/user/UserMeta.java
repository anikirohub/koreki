package watch.anikiro.koreki.model.user;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class UserMeta {
    private final Long id;
    private final LocalDateTime joinedAt;
    private LocalDateTime lastSeen;

    private String ipAddress;
    private String birthday;

    private UUID avatarHash;
    private UUID bannerHash;
}
