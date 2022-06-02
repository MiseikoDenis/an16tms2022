package model.human.jackets;

public class AdidasJacket implements IJacket {
    @Override
    public void putOn() {
        System.out.println("Dressed jacket Adidas");
    }

    @Override
    public void takeOff() {
        System.out.println("Remove jacket Adidas");
    }
}
