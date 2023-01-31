package ExceptionsLearning;

import java.io.IOException;
import java.sql.SQLException;

class PrintThread extends Thread {
    private int id;

    public PrintThread(int id) {
        this.id = id;
    }

    public void run() {
        for (int i = id; i <= 10; i += 3) {
            System.out.println(i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t1 = new PrintThread(1);
        Thread t2 = new PrintThread(2);
        Thread t3 = new PrintThread(3);

        t1.start();
        t2.start();
        t3.start();
    }
}
