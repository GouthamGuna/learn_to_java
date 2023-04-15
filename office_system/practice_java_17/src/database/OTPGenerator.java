package database;

import java.util.Random;

public class OTPGenerator {

    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static String generateOTP(int length) {
        StringBuilder builder = new StringBuilder();
        Random random = new Random();
        for (int i = 1; i <= length; i++) {
            int index = random.nextInt(ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(index));
        }
        return builder.toString();
    }

}
