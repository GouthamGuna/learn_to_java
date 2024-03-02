package in.dev.gmsk.configuration;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class WebMvcConfigurerAdapter {

    public static Map<String, String> setRegistry() {

        Map<String, String> returnMap = new HashMap<>();

        returnMap.put("X-Cerpsoft-Request-Id", UUID.randomUUID().toString());
        returnMap.put("X-Powered-By", "Java");
        returnMap.put("Server", "cerpsoft.in");
        returnMap.put("Author", "Gowtham Sankar Gunasekaran");

        return returnMap;
    }

    /*  GET,POST,DELETE,PUT,OPTIONS */

    public static Map<String, String> setCorsFilter() {

        Map<String, String> returnMap = new HashMap<>();

        returnMap.put("Access-control-Allow-origin", "*");
        returnMap.put("Access-Control-Allow-Methods", "GET");
        returnMap.put("Access-Control-Allow-Headers", "X-Auth-Token");

        return returnMap;
    }
}
