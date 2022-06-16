package hw4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@ToString
public class Car implements Serializable {
    private String brand;
    private Engine engine;
    private Tank tank;
    private int speed;
    private int price;

}
