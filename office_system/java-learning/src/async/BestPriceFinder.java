package async;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class BestPriceFinder {

    private final List<Shop> listOfShops = Arrays.asList(
            new Shop("UB City"),
            new Shop("Sukh Sagar"),
            new Shop("ETA Namma Mall"),
            new Shop("Garuda Mall"),
            new Shop("Mantri Square Mall")
    );

    private final Executor executor = Executors.newFixedThreadPool(
            listOfShops.size(), r -> {
                Thread thread = new Thread();
                thread.setDaemon(true);
                return thread;
            });

    public List<String> findPricesSequential(String product) {
        return listOfShops.stream()
                .map(listOfShops -> listOfShops.getName() + " Price is " + listOfShops.getPrice(product))
                .collect(Collectors.toList());
    }
}
