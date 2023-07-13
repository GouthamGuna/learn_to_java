package string;

public class Reverse {

    public static String reverse(String reverseSentence){

        if(reverseSentence.isBlank())
            return reverseSentence;

        return reverse(reverseSentence.substring(1)) + reverseSentence.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverse("Gowtham Sankar"));
    }
}
