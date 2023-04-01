package update_test;

public class FindLeapYear {

    public void leapYearFinder(int year){
        if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
            System.out.println("Specified year is a leap year "+ year);
        }else{
            System.out.println("Specified year is not  a leap year "+ year);
        }
    }
}
