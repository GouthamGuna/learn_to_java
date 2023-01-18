package string;

public class ReverseString {
    public static void main(String[] args) {
        
        String original = "Gowtham Sankar", reverse="";

        char ch;

        //reverse=reverse.replaceAll("\\s","");

        //System.out.println("reverse = " + reverse);

        for(int i=0; i<original.length(); i++){

             ch = original.charAt(i);

            reverse = reverse + ch;
        }

        System.out.println("reverse = " + reverse);

    }
}
