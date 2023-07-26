package array;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PickNameAtRandom {

    public static String getRandomName(List<String> listOfString) {
        String randomString = null;

        if (0 != listOfString.size()) {
            var rand = new Random();
            int index = rand.nextInt(listOfString.size());
            randomString = listOfString.get(index);
        }else return String.valueOf(new RuntimeException("List size is 0."));

        return randomString;
    }

    public static void main(String[] args) {

        List<String> nameList = Arrays.asList(); // Kavi", "Visi", "GMSK

        System.out.println("Your random name is " + getRandomName(nameList) + " now!");
    }
}
