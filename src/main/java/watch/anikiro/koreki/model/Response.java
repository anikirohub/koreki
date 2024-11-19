package watch.anikiro.koreki.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Response<T> {
    private final String message;
    private final T data;
}
