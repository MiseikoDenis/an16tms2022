package by.tms.service;

import by.tms.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer(
                "AMD Ryzen 5 5600X AM4, 6 x 3700 МГц, OEM",
                "GoodRAM 16 ГБ DDR4 2666 МГц DIMM CL19 GR2666D464L19/16G",
                "Western Digital WD Blue 1 ТБ WD10EZEX",
                1000000);
        comp.on();
        comp.off();
        System.out.println(comp);
    }
}
