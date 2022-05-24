package by.tms.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    public String cpu;
    public String ram;
    public String hdd;
    public int cycles;
    public boolean burned = false;
    public boolean on = false;

    public void on() {
        if (on) {
            System.out.println("Computer is already on!");
        } else if (!burned) {
            System.out.println("Attention! Enter 0 or 1: ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            Random rand = new Random();

            if (choice == rand.nextInt(2)) {
                System.out.println("Computer is on");
                on = true;
            } else {
                burned = true;
                System.out.println("Computer burned out!");
            }
            sc.close();
        } else {
            System.out.println("Error! Computer burned out!");
        }

    }

    public void off() {
        if (!on) {
            System.out.println("Computer is already off!");
        } else if (!burned) {
            System.out.println("Computer is off");
            cycles--;
            if (cycles < 0) {
                burned = true;
                System.out.println("Computer burned out!");
            }
        }
    }

    public Computer() {
    }

    public Computer(String cpu, String ram, String hdd, int cycles) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.cycles = cycles;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", cycles=" + cycles +
                '}';
    }
}
