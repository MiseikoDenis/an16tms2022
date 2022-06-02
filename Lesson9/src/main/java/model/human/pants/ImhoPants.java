package model.human.pants;

public class ImhoPants implements IPants {
    @Override
    public void putOn() {
        System.out.println("Dressed pants Imho");
    }

    @Override
    public void takeOff() {
        System.out.println("Remove pants Imho");
    }
}
