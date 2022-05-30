package by.tms.model.shop;

public class FlowerMarket {

    public Bouquet getBouquet(String... flowers) {
        Flower[] bouquet = new Flower[flowers.length];
        for (int i = 0; i < flowers.length; i++) {
            bouquet[i] = new Flower(flowers[i], FlowerType.valueOf(flowers[i]).getCost());
        }
        return new Bouquet(bouquet);
    }
}
