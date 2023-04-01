package update_test;

public class OddNumber {

    public void oddNumberTest(int input){
        if(input % 2 != 0){
            System.out.println("it's a Odd No "+input);
        }else{
            System.out.println("it's a Even No "+input);
        }
    }

    public void removeSpace(){

        String input = " ab, cd, ef, gh ";

        int count = 0;

        for(int i = 0; i < input.length(); i++){

            if(input.charAt(i) != ' ' && input.charAt(i) != ','){
                count++;
            }
        }
        System.out.println("The total number of characters in the string : "+count);
    }
}
