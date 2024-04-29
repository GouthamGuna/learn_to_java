package in.dev.gmsk.String;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;
import java.util.UUID;
import java.util.stream.IntStream;

public class InputFormat {

    public void problemOne() {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d %n", s1, x);
        }
        System.out.println("================================");
    }

    static UUID generateUUID() {
        return UUID.randomUUID();
    }

    static String URLEncode(String url) throws MalformedURLException, UnsupportedEncodingException {

        URL urlInstance = new URL(URLEncoder.encode(url, "UTF-8"));

        return urlInstance.toString();
    }

    static void learnJSEngineInJava(int a, int b) throws Exception {

        ScriptEngineManager scriptEngineManager =
                new ScriptEngineManager();

        ScriptEngine scriptEngine =
                scriptEngineManager.getEngineByName("javascript");

        String script = "function add(a, b) { return a + b; }";
        scriptEngine.eval(script);

        Object result = scriptEngine.eval("add(" + a + ", " + b + ")");
        System.out.println(result);
    }

    static String reverseString(String stringValue) {

        byte[] asAByteArray = stringValue.getBytes();
        byte[] result = new byte[asAByteArray.length];

        /*for (int i = 0; i < asAByteArray.length; i++) {
            result[i] = asAByteArray[asAByteArray.length - i - 1];
        }*/

        IntStream.range(0, asAByteArray.length)
                .forEach(i -> result[i] = asAByteArray[asAByteArray.length - i - 1]);

        return new String(result);
    }
}
