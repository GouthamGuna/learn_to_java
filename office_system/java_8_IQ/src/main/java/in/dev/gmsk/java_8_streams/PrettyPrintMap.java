package in.dev.gmsk.java_8_streams;

import com.google.gson.GsonBuilder;

import java.util.HashMap;
import java.util.Map;

public class PrettyPrintMap {

    public static void main(String[] args) {

        // System.out.println("CreatingMap() = " + CreatingMap());

        implementForLoop(getMap());

        printMap(0, getMap());

        implementStream(getMap());

        implementJsonLib(getMap());
    }

    private static Map<String, Object> getMap() {

        Map<String, Object> innerMap = new HashMap<>();
        innerMap.put("Ten", 10);
        innerMap.put("Eleven", 11);
        innerMap.put("Twelve", 12);

        Map<String, Object> returnMap = new HashMap<>();
        returnMap.put("One", 1);
        returnMap.put("Two", 2);
        returnMap.put("Three", 3);
        returnMap.put("Inner", innerMap);

        return returnMap;
    }

    private static void implementForLoop(Map<String, Object> objectMap) {

        for (Map.Entry<?, ?> entry : objectMap.entrySet()) {
            System.out.printf("%-15s : %s%n", entry.getKey(), entry.getValue());
        }
    }

    /**
     * To format our inner entries, let’s implement a helper function with a recursion and a left padding parametrized:
     */

    private static void printMap(int leftPadding, Map<?, ?> values) {
        for (Map.Entry<?, ?> entry : values.entrySet()) {
            if (entry.getValue() instanceof Map) {
                System.out.printf("%-15s :%n", entry.getKey());
                printMap(leftPadding + 4, (Map<?, ?>) entry.getValue());
            } else {
                System.out.printf("%" + (leftPadding > 0 ? leftPadding : "") + "s" // adding padding
                                + "%-15s : %s%n",
                        "", entry.getKey(), entry.getValue());
            }
        }
    }

    private static void implementStream(Map<String, Object> objectMap) {

        objectMap.forEach((k, v) -> System.out.printf("%-15s : %s%n", k, v));
    }

    /**
     * JSON libraries also support maps for pretty-printing
     */

    private static void implementJsonLib(Map<String, Object> MAP) {

        String returnString = new GsonBuilder().setPrettyPrinting().create().toJson(MAP);

        System.out.println("returnString = " + returnString);
    }
}
