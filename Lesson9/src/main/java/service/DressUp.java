package service;

import model.human.Human;
import model.human.jackets.AdidasJacket;
import model.human.jackets.DislabelJacket;
import model.human.jackets.PickupJacket;
import model.human.pants.BronksPants;
import model.human.pants.ImhoPants;
import model.human.pants.UltraboPants;
import model.human.shoes.ReebokShoes;
import model.human.shoes.TimejumpShoes;
import model.human.shoes.VansShoes;

public class DressUp {

    public static void main(String[] args) {
        Human jack = new Human("Jack", new AdidasJacket(), new BronksPants(), new ReebokShoes());
        Human lora = new Human("Lora", new DislabelJacket(), new ImhoPants(), new TimejumpShoes());
        Human dorian = new Human("Dorian", new PickupJacket(), new UltraboPants(), new VansShoes());

        Human[] people = new Human[]{jack, lora, dorian};

        for (Human human : people) {
            human.getDressed();
            human.undress();
        }
    }
}
