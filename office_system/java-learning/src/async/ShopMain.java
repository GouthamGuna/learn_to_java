package async;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import static java.lang.System.*;

public class ShopMain {

    public static void main(String[] args) {

        Shop shop = new Shop("BestShop");
        long start = nanoTime();
        Future<Double> futurePrice = shop.getPriceAsync("my favorite product");

        long invocationTime = ((nanoTime() - start) / 1_000_000);
        out.println("Invocation returned after " + invocationTime + " msecs");

        doSomethingElse();

        try {
            double price = futurePrice.get();
            out.printf("Price is %.2f%n", price);
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        long retrievalTime = ((nanoTime() - start) / 1_000_000);
        out.println("Price returned after " + retrievalTime + " msecs");
    }

    private static void doSomethingElse() {
        out.println("Doing something else...");
    }
}
