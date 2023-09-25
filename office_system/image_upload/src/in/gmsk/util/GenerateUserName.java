package in.gmsk.util;

import java.util.Random;

public class GenerateUserName {

    public static String getName() {

        final String ALPHA_NUMERIC_STRING = "abcdefghijklmnopqrstuvwxyz";

        StringBuilder builder = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(index));
        }
        return builder.toString();
    }
}
