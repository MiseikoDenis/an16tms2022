import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(3);
        ArrayList<Customer> queue = new ArrayList<>();
        queue.add(new Customer(sem, 1, new String[]{"Milk", "Soup"}));
        queue.add(new Customer(sem, 2, new String[]{"Cola"}));
        queue.add(new Customer(sem, 3, new String[]{"Lay's", "Sprite"}));
        queue.add(new Customer(sem, 4, new String[]{"Chicken", "Milk"}));
        queue.add(new Customer(sem, 5, new String[]{"Sausages", "Pasta"}));
        queue.add(new Customer(sem, 6, new String[]{"Pizza", "Cola"}));
        queue.add(new Customer(sem, 7, new String[]{"Buckwheat", "Water"}));
        queue.add(new Customer(sem, 8, new String[]{"Dumplings", "Ketchup"}));

        for (Customer customer : queue) {
            customer.start();
        }
    }
}
