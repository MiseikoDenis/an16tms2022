package model;

import lombok.Getter;

@Getter
public class Civil extends Air {

    private final int passengersCapacity;
    private final boolean business;

    public Civil(int power, int maxSpeed, int weight, String brand, int wingspan, int minRunwayLength, int passengersCapacity, boolean business) {
        super(power, maxSpeed, weight, brand, wingspan, minRunwayLength);
        this.passengersCapacity = passengersCapacity;
        this.business = business;
    }

    private String getBusinessClassInfo() {
        if (business) {
            return ", have business class";
        } else {
            return ", don't have business class";
        }
    }

    public void loading(int passengersNumber) {
        if (passengersNumber <= passengersCapacity) {
            System.out.println("Aircraft is loaded");
        } else {
            System.out.println("You need a bigger aircraft");
        }
    }

    public String info() {
        return "This civil aircraft have power " + getPower() + ", max speed " + getMaxSpeed() +
                ", weight " + getWeight() + ", brand " + getBrand() + ", " + getWingspan() +
                " wingspan, minimal runway length " + getMinRunwayLength() +
                ", number of passengers " + passengersCapacity + getBusinessClassInfo() + " and power in kW is " + powerKw();
    }
}
