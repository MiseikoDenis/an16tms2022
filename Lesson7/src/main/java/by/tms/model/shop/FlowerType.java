package by.tms.model.shop;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public enum FlowerType {
    ROSE(15),
    LILY(7),
    ASTER(5),
    HERBERA(5),
    TULIP(8),
    CARNATION(11);

    private int cost;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
