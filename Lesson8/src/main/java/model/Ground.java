package model;

import lombok.Getter;

@Getter
public abstract class Ground extends Transport {

    private final int wheels;
    private final double fuelConsumption;

    public Ground(int power, int maxSpeed, int weight, String brand, int wheels, double fuelConsumption) {
        super(power, maxSpeed, weight, brand);
        this.wheels = wheels;
        this.fuelConsumption = fuelConsumption;
    }
}
