package model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Employee implements Reportable {

    private String fullname;
    private double salary;

    @Override
    public void generateReport() {
        System.out.printf("|%s    |    %.2f|\n", shortName(fullname), salary);
    }
    
    public String shortName(String fullname) {
        String[] name = fullname.split("\\s+");
        return String.format("%s. %s. %s", name[0].charAt(0), name[1].charAt(0), name[2]);
    }
}
