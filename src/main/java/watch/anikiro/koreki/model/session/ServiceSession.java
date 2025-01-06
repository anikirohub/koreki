package watch.anikiro.koreki.model.session;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ServiceSession {
    private String serviceName;
    private String token;

    private String ip;
    private int port;
}
