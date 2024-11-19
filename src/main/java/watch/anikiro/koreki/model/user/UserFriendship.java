package watch.anikiro.koreki.model.user;

import lombok.Data;
import watch.anikiro.koreki.type.FriendshipStatus;

import java.time.LocalDateTime;

@Data
public class UserFriendship {
    private Long id;
    private Long requesterId;
    private Long receiverId;

    private FriendshipStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
