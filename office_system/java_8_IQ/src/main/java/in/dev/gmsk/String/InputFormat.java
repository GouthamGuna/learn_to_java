package in.dev.gmsk.String;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;
import java.util.UUID;

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
}
