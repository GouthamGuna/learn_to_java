package in.dev.gmsk.java_8_streams;

import java.util.HashMap;
import java.util.Map;

public class PrettyPrintMap {

    public static void main(String[] args) {
        // System.out.println("CreatingMap() = " + CreatingMap());
        implementForLoop(CreatingMap());
    }

    private static Map<String, Object> CreatingMap() {

        Map<String, Object> innerMap = new HashMap<>();
        innerMap.put("Ten", 10);
        innerMap.put("Eleven", 11);

        Map<String, Object> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 2);
        map.put("Inner", innerMap);

        return map;
    }

    private static void implementForLoop(Map<String, Object> objectMap) {

        for (Map.Entry<?, ?> entry : objectMap.entrySet()) {
            System.out.printf("%-15s : %s%n", entry.getKey(), entry.getValue());
        }
    }
}
