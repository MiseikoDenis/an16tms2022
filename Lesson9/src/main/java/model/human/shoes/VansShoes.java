package model.human.shoes;

public class VansShoes implements IShoes {
    @Override
    public void putOn() {
        System.out.println("Dressed shoes Vans");
    }

    @Override
    public void takeOff() {
        System.out.println("Remove shoes Vans");
    }
}
