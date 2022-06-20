package shop;

import lombok.AllArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

@AllArgsConstructor
public class Shop {
    ArrayList<Product> list;

    public void start() {
        Scanner in = new Scanner(System.in);
        System.out.println("""
                Выберите действие:
                1. Показать все товары
                2. Добавить новый товар
                3. Удалить товар
                4. Редактировать товар
                5. Выход""");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                sort();
                more();
                break;
            case 2:
                addProduct();
                more();
                break;
            case 3:
                deleteProduct();
                more();
                break;
            case 4:
                setProduct();
                more();
                break;
            case 5:
                break;
            default:
                System.out.println("Неправильно выбран пункт. Повторите выбор");
                start();
        }
        in.close();
    }

    public void sort() {
        Scanner in = new Scanner(System.in);
        System.out.println("""
                Выберите как список должен быть отсортирован
                1. по цене (возрастанию)
                2. по цене (убыванию)
                3. по добавлению(сначала новые, потом более старые)""");
        int choice = in.nextInt();
        switch (choice) {
            case 1 -> {
                sortByPrice();
                System.out.println(getList());
            }

            case 2 -> {
                sortByPriceReversed();
                System.out.println(getList());
            }

            case 3 -> {
                sortByTime();
                System.out.println(getList());
            }

            default -> {
                System.out.println("Неправильно выбран пункт. Повторите выбор");
                sort();
            }
        }
    }

    public void addProduct() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите id товара");
        int id = in.nextInt();
        System.out.println("Введите название товара");
        String name = in.nextLine();
        System.out.println("Введите цену товара");
        int price = in.nextInt();
        add(new Product(id, name, price, LocalDateTime.now()));
    }

    public void deleteProduct() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите id товара который хотите удалить");
        int id = in.nextInt();
        delete(id);
    }

    public void setProduct() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите id товара");
        int id = in.nextInt();
        System.out.println("Введите название товара");
        String name = in.nextLine();
        System.out.println("Введите цену товара");
        int price = in.nextInt();
        set(new Product(id, name, price, LocalDateTime.now()));
    }

    public void more() {
        Scanner in = new Scanner(System.in);
        System.out.println("""
                Вы хотите сделать что-то еще?
                1. Да
                2. Нет""");
        int choice = in.nextInt();
        switch (choice) {
            case 1 -> start();
            case 2 -> in.close();
            default -> System.out.println("Неправильно выбран пункт. Повторите выбор");
        }
    }

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
