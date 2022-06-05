package model.spaceport;

public class SpaceX implements IStart {
    @Override
    public boolean check() {
        return ((int) (Math.random() * 100)) > 3;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели SpaceX запущены\nВсе системы в норме");
    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX. Маск доволен!");
    }
}
