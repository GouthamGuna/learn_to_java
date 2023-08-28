package async;

public class Util {

    {
        // non-static block...

        try{

        }catch (Exception e){
            e.printStackTrace();
        }
    }



    public static void delay() {
        int delay = 1000; // One minute`s
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
