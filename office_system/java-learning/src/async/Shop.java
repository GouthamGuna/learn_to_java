package async;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

import static async.Util.*;

public class Shop {

    /**
     * AsyncShop: Use the factory method supplyAsync to create CompletableFuture.
     */

    private final String name;
    private final Random random;

    public Shop(String name) {
        this.name = name;
        random = new Random(
                name.charAt(0) * name.charAt(1) * name.charAt(2)
        );
    }

    /**
     * Randomly generate prices based on product names.
     */

    public double getPrice(String product) {
        return calculatePrice(product);
    }

    private double calculatePrice(String product) {
        delay();
        return random.nextDouble() * product.charAt(0) + product.charAt(1);
    }

    public Future<Double> getPriceAsync(String product) {
        CompletableFuture<Double> futurePrice = new CompletableFuture<>();
        new Thread(() -> {
            double price = calculatePrice(product);
            futurePrice.complete(price);
        }).start();
        return futurePrice;
    }
}
