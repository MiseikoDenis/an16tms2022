package model.human.jackets;

public class PickupJacket implements IJacket {
    @Override
    public void putOn() {
        System.out.println("Dressed jacket Pickup");
    }

    @Override
    public void takeOff() {
        System.out.println("Remove jacket Pickup");
    }
}
