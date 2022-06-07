package service;

import model.authorization.Authorization;
import model.car.Car;
import model.car.EngineFailException;

public class Main {
    public static void main(String[] args) {

        //Задача с машиной
        Car[] cars = new Car[]{
                new Car("Mitsubishi", 250, 20000),
                new Car("Geely", 300, 50000),
                new Car("Reno", 200, 15000)
        };

        for (Car car : cars) {
            try {
                car.start();
            } catch (EngineFailException e) {
                System.out.println(e.getMessage());
            }
        }

        //Задача про авторизацию
        System.out.println("Authorization was complete? : "
                + Authorization.checkAuthorization("_login34737asfa_236_", "pass1", "pass"));
    }
}
