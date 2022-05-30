package by.tms.model.shop;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Bouquet {

    private Flower[] bouquet;

    public int Cost() {
        int cost = 0;
        for (Flower flower : bouquet) {
            cost += flower.getCost();
        }
        return cost;
    }

    public int number() {
        return bouquet.length;
    }

    @Override
    public String toString() {
        String flowers = "";
        for (Flower flower : bouquet) {
            flowers += flower.getName() + " ";
        }
        return flowers;
    }
}
