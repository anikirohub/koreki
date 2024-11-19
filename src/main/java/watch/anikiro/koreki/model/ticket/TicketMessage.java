package watch.anikiro.koreki.model.ticket;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TicketMessage {
    private Long id;
    private Long userId;

    private String content;
    private LocalDateTime timestamp;
}
