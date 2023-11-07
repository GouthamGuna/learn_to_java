package in.dev.gmsk.threading;

public class ThreadA {

    public static void main(String[] args) throws InterruptedException{

        System.out.println("Main method = "+Thread.currentThread().getName());

        ThreadB threadB = new ThreadB();
        threadB.start();

        synchronized (threadB) {

            threadB.wait(1000);
            System.out.println("Output = " + threadB.someList);
        }
    }
}
