package model;

import lombok.Getter;

@Getter
public class Military extends Air {

    private final boolean ejectionPresence;
    private int rockets;

    public Military(int power, int maxSpeed, int weight, String brand, int wingspan, int minRunwayLength, boolean ejectionPresence, int rockets) {
        super(power, maxSpeed, weight, brand, wingspan, minRunwayLength);
        this.ejectionPresence = ejectionPresence;
        this.rockets = rockets;
    }

    private String ejectionPresence() {
        if (ejectionPresence) {
            return ", have ejection";
        } else {
            return ", don't have ejection";
        }
    }

    public void fire() {
        if (rockets == 0) {
            System.out.println("You don't have rockets!");
        } else {
            System.out.println("Rocket fired...");
            rockets--;
        }
    }

    public void ejection() {
        if (ejectionPresence) {
            System.out.println("The ejection was successful");
        } else {
            System.out.println("This plane don't have ejection");
        }
    }

    public String info() {
        return "This war plane have power " + getPower() + ", max speed " + getMaxSpeed() +
                ", weight " + getWeight() + ", brand " + getBrand() + ", " + getWingspan() +
                " wingspan, minimal runway length " + getMinRunwayLength() +
                ", number of rockets on board " + rockets + ejectionPresence() + " and power in kW is " + powerKw();
    }
}
