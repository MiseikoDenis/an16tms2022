package model.human.shoes;

public class ReebokShoes implements IShoes {
    @Override
    public void putOn() {
        System.out.println("Dressed shoes Reebok");
    }

    @Override
    public void takeOff() {
        System.out.println("Remove shoes Reebok");
    }
}
