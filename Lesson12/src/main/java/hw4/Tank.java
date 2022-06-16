package hw4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@ToString
public class Tank implements Serializable {
    private String fuelType;
    private int capacity;
}
