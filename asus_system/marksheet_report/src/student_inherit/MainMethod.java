package student_inherit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainMethod {

    public static void main(String[] args) {

        HelperClass helperClass = new HelperClass();

        //System.out.println(Arrays.toString(helperClass.getStudentList()));

        int totalMark = 100;

        int testTotalMark = 500;

        double totalPercentage = 0.0;

        for(Student retrieve: helperClass.getStudentList()){

            int stuTotalMark = retrieve.getTamil() + retrieve.getEnglish() + retrieve.getMaths() + retrieve.getScience() + retrieve.getSocialScience();
            totalPercentage = ((double) (stuTotalMark * totalMark) / testTotalMark);

           // System.out.println(retrieve.getStudentName()+" : "+retrieve.getStudentRollNo()+" : Total Marks List : "+ stuTotalMark);

            System.out.println(retrieve.getStudentName()+" : "+retrieve.getStudentRollNo()+" : Total Percentage  : "+ totalPercentage);
        }
    }
}
