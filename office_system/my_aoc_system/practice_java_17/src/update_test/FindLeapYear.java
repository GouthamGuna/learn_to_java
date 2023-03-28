package test;

public class FindLeapYear {

    public void leapYearFinder(int year){
        if(((year % 4 == 0) || (year % 100 != 0)) && (year % 400 == 0)){
            System.out.println("Entered year is Leap Year "+ year);
        }else{
            System.out.println("Entered year is Not Leap Year "+ year);
        }
    }
}
