package hw4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@ToString
public class Engine implements Serializable {
    private String type;
    private transient int cylinder;
}
