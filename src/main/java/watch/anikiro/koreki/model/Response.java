package watch.anikiro.koreki.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Response<T> {
    private final T data;
    private final String message;
}
