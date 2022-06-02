package model.human.shoes;

public class TimejumpShoes implements IShoes {
    @Override
    public void putOn() {
        System.out.println("Dressed shoes Timejump");
    }

    @Override
    public void takeOff() {
        System.out.println("Remove shoes Timejump");
    }
}
