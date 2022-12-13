package String;

public class StringReverseWord {
    public static void main(String[] args) {

        String str = "DLROW OLLEH", rstr="";
        char ch;

        for(int i=0; i<str.length(); i++){

            ch=str.charAt(i);
            rstr=ch+rstr;

            System.out.print(i);
        }
        System.out.println(" "+rstr);
    }
}
