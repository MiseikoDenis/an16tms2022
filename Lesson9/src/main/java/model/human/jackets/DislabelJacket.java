package model.human.jackets;

public class DislabelJacket implements IJacket {
    @Override
    public void putOn() {
        System.out.println("Dressed jacket Disable");
    }

    @Override
    public void takeOff() {
        System.out.println("Remove jacket Disable");
    }
}
