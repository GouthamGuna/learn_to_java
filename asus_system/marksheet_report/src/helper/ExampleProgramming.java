package helper;

import entity.SubjectEntity;
import service.serviceImpl.SubjectServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
}
