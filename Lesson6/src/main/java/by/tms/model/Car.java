package by.tms.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Car {
    private boolean moving;
    private int distance;
    private int year;
    private String model;
    private final Engine engine;
    private Tank tank;


    public Car(Engine engine, Tank tank) {
        this.engine = engine;
        this.tank = tank;
    }

    public void onEngine() {
        if (tank.getCurrentFuel() > 0) {
            engine.setOn(true);
            System.out.println("Engine on");
        } else {
            System.out.println("Tank is empty");
        }
    }

    public void offEngine(){
        if (moving){
            System.out.println("Please stop the car first");
        } else {
            engine.setOn(false);
        }
    }

    public void start() {
        if (engine.isOn()) {
            moving = true;
            System.out.println("Car started");
        } else {
            System.out.println("Engine is off");
        }
    }

    public void stop() {
        if (engine.isOn()) {
            distance += (int) (Math.random() * 100);
            moving = false;
            System.out.println("Car stopped");
        } else {
            System.out.println("Engine is already off");
        }
    }

    public void getDistance() {
        System.out.println("Distance traveled: " + distance);
    }

    public void fill(int amount) {
        if(tank.getCurrentFuel()+amount<= tank.getCapacity()) {
            tank.setCurrentFuel(tank.getCurrentFuel() + amount);
        } else {
            tank.setCurrentFuel(tank.getCapacity());
            System.out.println("Too much fuel");
        }
    }

    public int currentFuel() {
        return tank.getCurrentFuel();
    }
}
