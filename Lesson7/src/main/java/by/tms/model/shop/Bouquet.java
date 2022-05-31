package by.tms.model.shop;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Bouquet {

    private Flower[] flowers;

    public int cost() {
        int cost = 0;
        for (Flower flower : flowers) {
            cost += flower.getCost();
        }
        return cost;
    }

    public int getCountFlowers() {
        return flowers.length;
    }

    @Override
    public String toString() {
        String flowers = "";
        for (Flower flower : this.flowers) {
            flowers += flower.getName() + " ";
        }
        return flowers;
    }
}
