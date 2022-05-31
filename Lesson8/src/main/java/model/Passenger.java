package model;

import lombok.Getter;

@Getter
public class Passenger extends Ground {

    private final String bodyType;
    private final int passengers;

    public Passenger(int power, int maxSpeed, int weight, String brand, int wheels, double fuelConsumption, String bodyType, int passengers) {
        super(power, maxSpeed, weight, brand, wheels, fuelConsumption);
        this.bodyType = bodyType;
        this.passengers = passengers;
    }

    private double consume(double distance) {
        return getFuelConsumption() * distance / 100;
    }

    private double distance(double time) {
        return time * getMaxSpeed();
    }

    public void distanceInfo(double time) {
        System.out.println("In " + time + " hours, passenger car " + getBrand() + " will pass " + distance(time) +
                "km and will consume " + consume(distance(time)) + "fuel, moving with max speed " + getMaxSpeed());
    }

    public String info() {
        return "This passenger car have power " + getPower() + ", max speed " + getMaxSpeed() +
                ", weight " + getWeight() + ", brand " + getBrand() + ", " + getWheels() +
                " number of wheels, fuel consumption " + getFuelConsumption() + ", body type " + bodyType +
                ", number of passengers " + passengers + " and power in kW is " + powerKw();
    }
}
