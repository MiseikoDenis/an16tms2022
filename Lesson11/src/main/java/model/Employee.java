package model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Employee implements Report {

    private String fullname;
    private double salary;

    public String shortName(String fullname) {
        String[] name = fullname.split("\\s+");
        return String.format("%s. %s. %s", name[0].charAt(0), name[1].charAt(0), name[2]);
    }

    @Override
    public void generateReport() {
        System.out.printf("|%s    |    %.2f|\n", shortName(fullname), salary);
    }
}
