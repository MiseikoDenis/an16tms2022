package model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class Transport {

    private int power;
    private int maxSpeed;
    private int weight;
    private String brand;

    public double powerKw() {
        return power * 0.74;
    }
}
