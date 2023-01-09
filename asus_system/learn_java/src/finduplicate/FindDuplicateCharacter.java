package finduplicate;

import java.util.HashSet;
import java.util.Scanner;

public class FindDuplicateCharacter {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter your String : ");
        String userInput = scanner.next();

        HashSet<Character> getCharacter=new HashSet<>();

        for (char c: userInput.toCharArray()){
            if (getCharacter.contains(c)){
                System.out.println("Duplicate is : "+c);
            }else {
                getCharacter.add(c);
            }
        }
    }
}
