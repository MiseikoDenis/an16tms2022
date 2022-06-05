package model.human.pants;

public class BronksPants implements IPants {
    @Override
    public void putOn() {
        System.out.println("Dressed pants Bronks");
    }

    @Override
    public void takeOff() {
        System.out.println("Remove pants Bronks");
    }
}
