package model.car;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Car {
    private String model;
    private int maxSpeed;
    private int price;

    public void start() throws EngineFailException {
        if (((int) (Math.random() * 21)) % 2 != 0) throw new EngineFailException("Car " + model + " broke");
        System.out.println("Car " + model + " started");
    }

}
