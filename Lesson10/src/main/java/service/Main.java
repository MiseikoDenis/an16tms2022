package service;

import model.authorization.Authorization;
import model.authorization.WrongLoginException;
import model.authorization.WrongPasswordException;
import model.car.Car;
import model.car.EngineFailException;

public class Main {
    public static void main(String[] args) {

        //Задача с машиной
        Car car1 = new Car("Mitsubishi", 250, 20000);
        Car car2 = new Car("Geely", 300, 50000);
        Car car3 = new Car("Reno", 200, 15000);

        try {
            car1.start();
            car2.start();
            car3.start();
        } catch (EngineFailException e) {
            throw new RuntimeException(e);
        }

        //Задача про авторизацию
        try {
            boolean check = Authorization.authorization("_login34737asfa_236_", "pass1", "pass");
            System.out.println(check);
        } catch (WrongLoginException | WrongPasswordException e) {
            throw new RuntimeException(e);
        }
    }
}
