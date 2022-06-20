package shop;

import lombok.AllArgsConstructor;

import java.util.ArrayList;

@AllArgsConstructor
public class Shop {
    ArrayList<Product> list;

    public void add(Product product) {
        if (list.isEmpty()) {
            list.add(product);
            System.out.println("Product added: " + product);
        } else {
            boolean exist = false;
            for (Product value : list) {
                if (value.getId() == product.getId()) {
                    exist = true;
                    System.out.println("Product with such ID already exist!");
                    break;
                }
            }
            if (!exist) {
                list.add(product);
                System.out.println("Product added: " + product);
            }
        }
    }

    public ArrayList<Product> getList() {
        return list;
    }

    public void delete(int id) {
        if (list.isEmpty()) {
            System.out.println("Shop is empty!");
        } else {
            boolean exist = false;
            for (Product value : list) {
                if (value.getId() == id) {
                    exist = true;
                    list.remove(value);
                    System.out.println("Product with ID " + id + " deleted.");
                    break;
                }
            }
            if (!exist) {
                System.out.println("There are no product with such ID");
            }
        }
    }

    public void set(Product product) {
        if (list.isEmpty()) {
            System.out.println("Shop is empty!");
        } else {
            boolean exist = false;
            for (Product value : list) {
                if (value.getId() == product.getId()) {
                    exist = true;
                    list.set(list.indexOf(value), product);
                    System.out.println("Product with ID " + value.getId() + " set.");
                    break;
                }
            }
            if (!exist) {
                System.out.println("There are no product with such ID");
            }
        }
    }

    public void sortByTime() {
        ProductTimeComparator pcomp = new ProductTimeComparator();
        list.sort(pcomp);
    }

    public void sortByPrice() {
        ProductPriceComparator comp = new ProductPriceComparator();
        list.sort(comp);
    }

    public void sortByPriceReversed() {
        ProductPriceComparator comp = new ProductPriceComparator();
        list.sort(comp.reversed());
    }
}
