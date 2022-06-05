package model.spaceport;

public class Shuttle implements IStart {
    @Override
    public boolean check() {
        return ((int) (Math.random() * 11)) > 3;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели шаттла запущены\nВсе системы в норме");
    }

    @Override
    public void start() {
        System.out.println("Старт шаттла");
    }
}
