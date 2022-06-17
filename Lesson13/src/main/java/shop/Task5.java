package shop;

import java.util.ArrayList;

public class Task5 {
    public static void task() {
        Shop mall = new Shop(new ArrayList<>());
        mall.add(new Product(24, "Milk", 20));
        mall.add(new Product(25, "Cola", 15));

        System.out.println(mall.getList());
    }
}
