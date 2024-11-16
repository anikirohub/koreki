package watch.anikiro.koreki.model.ticket;

import lombok.Data;
import watch.anikiro.koreki.type.TicketStatus;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Ticket {
    private final Long id;
    private final Long userId;

    private TicketStatus status;
    private List<TicketMessage> messages;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime closedAt;
}
