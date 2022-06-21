package hw1;

import java.io.File;
import java.util.Objects;

public class Task1 {
    public static void task(String path) {

        File dir = new File(path);
        if (dir.isDirectory()) {
            for (File item : Objects.requireNonNull(dir.listFiles())) {
                if (item.isDirectory()) {
                    System.out.println(item.getName() + "\t folder in " + item.getParent());
                    task(path + "\\" + item.getName());
                } else {
                    System.out.println(item.getName() + " " + item.length() + " bytes \t file in " + item.getParent());
                }
            }
        }
    }
}
