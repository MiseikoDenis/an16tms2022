package model;

import lombok.Getter;

@Getter
public class Truck extends Ground {

    private final int carrying;

    public Truck(int power, int maxSpeed, int weight, String brand, int wheels, double fuelConsumption, int carrying) {
        super(power, maxSpeed, weight, brand, wheels, fuelConsumption);
        this.carrying = carrying;
    }

    public void loading(int cargo) {
        if (cargo <= carrying) {
            System.out.println("Truck is loaded");
        } else {
            System.out.println("You need a bigger truck");
        }
    }

    public String info() {
        return "This truck have power " + getPower() + ", max speed " + getMaxSpeed() +
                ", weight " + getWeight() + ", brand " + getBrand() + ", " + getWheels() +
                " number of wheels, fuel consumption " + getFuelConsumption() + ", carrying " + carrying +
                " and power in kW is " + powerKw();
    }
}
