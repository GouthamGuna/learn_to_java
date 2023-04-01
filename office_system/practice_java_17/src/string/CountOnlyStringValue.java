package string;

public class CountOnlyStringValue {
    public static void main(String[] args) {
        String str = " ab, cd, ef, gh ";
        int count = 0;

        for(int i = 0; !(i >= str.length()); i++)
            if (str.charAt(i) != ' ' && str.charAt(i) != ',') {
                count++;
            }
        System.out.println("The total number of characters in the string : "+count);
    }
}
