package in.dev.gmsk;

public class Main {

    public static void main(String[] args) {

        if (args.length >= 2) {
            System.out.printf("%s%s%n", args[0], args[1]);
            return;
        }

        System.out.println("Hello world!");
    }
}