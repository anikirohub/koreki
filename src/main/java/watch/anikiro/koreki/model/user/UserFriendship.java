package watch.anikiro.koreki.model.user;

import lombok.Data;
import watch.anikiro.koreki.type.FriendshipStatus;

import java.time.LocalDateTime;

@Data
public class UserFriendship {
    private final Long id;
    private final Long requesterId;
    private final Long receiverId;

    private FriendshipStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
