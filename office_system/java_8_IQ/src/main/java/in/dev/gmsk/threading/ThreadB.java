package in.dev.gmsk.threading;

import java.util.ArrayList;
import java.util.List;

public class ThreadB extends Thread{

    List<Integer> someList = new ArrayList<>();

    @Override
    public void run() {

        System.out.println("Child method = "+Thread.currentThread().getName());

        synchronized (this) {
            int total = 0;

            for (int i = 0; i <= 100; i++) {
                someList.add(total += i);
            }

            this.notify();
        }
    }
}
