package model.spaceport;


public class Spaceport {

    public void start(IStart start) {
        if (start.check()) {
            start.engineStart();
            int count = 10;
            while (count != 0) {
                System.out.println(count);
                count--;
            }
            start.start();
        } else {
            System.out.println("Предстартовая проверка провалена!");
        }
    }
}
