package in.dev.gmsk.threading;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


/**
 * In Server side refresh set header :  response.setHeader("refresh", "5");
 */

public class TaskScheduler {

    public static void main(String[] args) {
        exampleOne();
        exampleTwo();
        exampleThree();
    }

    private static void exampleOne() {

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Runnable task = () -> {
            // Your method logic goes here
            System.out.println("Executing method every 3 seconds...");
        };

        // Schedule the task to run every 5 seconds
        // ScheduledFuture<?> handle = scheduler.scheduleAtFixedRate(task, 0, 5, TimeUnit.SECONDS);
        scheduler.scheduleAtFixedRate(task, 0, 3, TimeUnit.SECONDS);
    }

    private static void exampleTwo() {
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

        Runnable task = () -> {
            // Your method logic goes here
            System.out.println("Executing method every 5 seconds...");
        };

        executor.scheduleAtFixedRate(task, 0, 5, TimeUnit.SECONDS);
    }

    private static void exampleThree() {
        Timer timer = new Timer();
        timer.schedule(new MyTask(), 0, 5000); // Execute every 5 seconds
    }
}

class MyTask extends TimerTask {

    @Override
    public void run() {
        // Call your method here
        System.out.println("Method called every 5 seconds!");
    }
}