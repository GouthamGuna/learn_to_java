package ObjectClass;

public class ObjectClassMethod implements Runnable{
    public static void main(String[] args) {
        Object obj=new String[] {"one", "two", "three"};

        for(String s: (String[]) obj){
            System.out.println(s+",");
        }

        ObjectClassMethod thread=new ObjectClassMethod();
        thread.run();
    }

    @Override
    public void run() {
        System.out.println("This code id running in a thread...");
    }
}
