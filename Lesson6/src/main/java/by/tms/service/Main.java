package by.tms.service;

import by.tms.model.*;

public class Main {

    public static void main(String[] args) {

        //Задача про военкомат
//        Person[] personRegistry = new Person[]{
//                new Person("Иван", 24, "Мужчина", "Беларусь", "Минск"),
//                new Person("Александр", 17, "Боевой вертолет Апачи", "Беларусь", "Брест"),
//                new Person("Инна", 27, "Женщина", "Беларусь", "Минск"),
//                new Person("Петр", 26, "Мужчина", "Украина", "Киев")
//        };
//
//        MilitaryOffice mf = new MilitaryOffice(personRegistry);
//
//        mf.all();
//        mf.readyCity("Минск");
//        mf.readyAge();
//        mf.readyName("Александр");

        //Задача про машины
        Car car = new Car(new Engine(), new Tank());

    }
}
