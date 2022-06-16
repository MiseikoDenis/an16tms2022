package hw4;

import java.io.*;

public class Task4 {

    private static final String PATH = "Lesson12\\src\\main\\java\\hw4\\";

    public static void task() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATH + "output.txt"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATH + "output.txt"))) {
            Car car = new Car("Honda", new Engine("Electrical", 5), new Tank("natural", 4000), 300, 30000);
            oos.writeObject(car);

            Car car2 = (Car) ois.readObject();
            System.out.println(car2.toString());
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
