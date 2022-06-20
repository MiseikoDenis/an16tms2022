package shop;

import java.time.LocalDate;
import java.util.ArrayList;

public class Task5 {
    public static void task() {
        Shop mall = new Shop(new ArrayList<>());
        mall.add(new Product(24, "Milk", 20, LocalDate.now()));
        mall.add(new Product(25, "Cola", 15, LocalDate.now()));
        mall.add(new Product(28, "Soup", 23, LocalDate.now()));
        System.out.println(mall.getList());

        mall.delete(25);
        System.out.println(mall.getList());

        mall.set(new Product(24, "Cola", 25, LocalDate.now()));
        System.out.println(mall.getList());

        mall.sort();
        System.out.println(mall.getList());
    }
}
