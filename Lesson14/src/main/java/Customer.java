import lombok.AllArgsConstructor;

import java.util.Arrays;
import java.util.concurrent.Semaphore;

@AllArgsConstructor
public class Customer extends Thread {
    Semaphore sem;
    int id;
    String[] purchases;

    @Override
    public void run() {
        try {
            sem.acquire();
            System.out.println("Customer " + id + " come to the cash register with " + Arrays.toString(purchases));
            sleep(1000);
            System.out.println("Customer " + id + " finished shopping");
            sem.release();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
