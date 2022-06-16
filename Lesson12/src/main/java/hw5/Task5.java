package hw5;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task5 {

    private static final String PATH = "Lesson12\\src\\main\\java\\hw5\\";

    public static void task() {
        StringBuilder str = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(PATH + "car.json"))) {
            String s;
            while ((s = br.readLine()) != null) {
                if (s.endsWith("-")) {
                    s = s.substring(0, s.length() - 1);
                }
                str.append(s);
            }
            ObjectMapper mapper = new ObjectMapper();
            Car car = mapper.readValue(str.toString(), Car.class);
            System.out.println(car.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
