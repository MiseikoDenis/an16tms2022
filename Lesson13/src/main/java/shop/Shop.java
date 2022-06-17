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
                    remove();
                    System.out.println("Product with such ID already exist!");
                    break;
                }
            }
            if (!exist) {
                System.out.println("There are no product with such ID");
            }
        }
    }
}
