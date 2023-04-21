package helper;

import java.util.*;

public class ExampleProgramming {

    public void studentGrade(){

        int[] marks = {10,19,21,29,31,30,39,40,41,49,51,50,61,65,69,70,71,75,79,80,81,85,89,90,91,95,99};
        String grade = null;

        for(int i = 0; i < marks.length; i++){

            int mark = marks[i];

            if(mark >= 90){
                grade = "A";
            } else if (mark >= 80) {
                grade = "B";
            } else if (mark >= 70) {
                grade = "C";
            } else if (mark >= 60) {
                grade = "D";
            } else if (mark >= 50) {
                grade = "E";
            } else if (mark >= 40) {
                grade = "U";
            } else if (mark >= 30){
                grade = "W";
            } else {
                grade = "F";
            }

            System.out.println("Student "+(i + 1)+" mark : "+mark +" Grade : "+grade);
        }
    }

    public void studentSubjectMapping(){

        Map<String, List<String> > studentSubjects = new HashMap<>();

        List<String> subjects1 = new ArrayList<>();
        subjects1.add("Math");
        subjects1.add("Science");
        subjects1.add("English");
        subjects1.add("Social Studies");
        subjects1.add("History");
        studentSubjects.put("Student 1", subjects1);

        List<String> subjects2 = new ArrayList<>();
        subjects2.add("Math");
        subjects2.add("Science");
        subjects2.add("Geography");
        subjects2.add("History");
        subjects2.add("Spanish");
        studentSubjects.put("Student 2", subjects2);

        List<String> subjects3 = new ArrayList<>();
        subjects3.add("Math");
        subjects3.add("Science");
        subjects3.add("English");
        subjects3.add("Art");
        subjects3.add("Music");
        studentSubjects.put("Student 3", subjects3);

        /**
         *
         *  for(String student: studentSubjects.keySet()){
         *             System.out.println(student + ": " + studentSubjects.get(student));
         *         }
         */

       studentSubjects.keySet().stream().map(student -> student + ": " + studentSubjects.get(student)).forEach(System.out::println);
    }
}
