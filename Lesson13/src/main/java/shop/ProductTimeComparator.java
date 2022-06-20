package shop;

import java.util.Comparator;

public class ProductTimeComparator implements Comparator<Product> {


    public int compare(Product a, Product b) {
        return b.getDate().compareTo(a.getDate());
    }
}
