package model.human;

import lombok.AllArgsConstructor;
import model.human.jackets.IJacket;
import model.human.pants.IPants;
import model.human.shoes.IShoes;

@AllArgsConstructor
public class Human implements IHuman {
    private String name;
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;

    @Override
    public void getDressed() {
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    @Override
    public void undress() {
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }
}
