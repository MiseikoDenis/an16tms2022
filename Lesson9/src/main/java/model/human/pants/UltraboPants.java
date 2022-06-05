package model.human.pants;

public class UltraboPants implements IPants {
    @Override
    public void putOn() {
        System.out.println("Dressed pants Ultrabo");
    }

    @Override
    public void takeOff() {
        System.out.println("Remove pants Ultrabo");
    }
}
