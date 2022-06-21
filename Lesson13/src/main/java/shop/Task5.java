package shop;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Task5 {
    public static void task() {
        Shop mall = new Shop(new ArrayList<>());
        mall.add(new Product(24, "Milk", 20, LocalDateTime.now()));
        mall.add(new Product(25, "Cola", 15, LocalDateTime.now()));
        mall.add(new Product(28, "Soup", 23, LocalDateTime.now()));

        mall.start();

    }
}
