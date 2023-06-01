package thread;

import java.util.Timer;
import java.util.TimerTask;

public class ChildThread implements Runnable{
    @Override
    public void run() {

        long starting = System.currentTimeMillis();
        for(int i=1; i <= 1000; i++){
            System.out.println("Number : "+i);
        }
        long ending = System.currentTimeMillis();

        System.out.println(starting);
        System.out.println(ending - starting);
    }
}
