package shop;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice() - o2.getPrice();
    }

    @Override
    public Comparator<Product> reversed() {
        return Comparator.super.reversed();
    }
}
