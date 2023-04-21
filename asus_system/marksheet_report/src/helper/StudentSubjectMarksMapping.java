package helper;

import entity.Student;

import java.util.*;

public class StudentSubjectMarksMapping {

    public void setStudentSubjectMarksMapping(){

        // Create a Map to store the subjects and marks for each student
        Map<String, Map<String, Integer>> studentSubjectMarks = new HashMap<>();

        // Add subjects and marks for student 1
        Map<String, Integer> subjectMarks1 = new HashMap<>();
        subjectMarks1.put("Math", 90);
        subjectMarks1.put("Science", 85);
        subjectMarks1.put("English", 92);
        subjectMarks1.put("Social Studies", 87);
        subjectMarks1.put("History", 88);
        studentSubjectMarks.put("Student 1", subjectMarks1);

        // Add subjects and marks for student 2
        Map<String, Integer> subjectMarks2 = new HashMap<>();
        subjectMarks2.put("Math", 95);
        subjectMarks2.put("Science", 89);
        subjectMarks2.put("Geography", 92);
        subjectMarks2.put("History", 90);
        subjectMarks2.put("Spanish", 86);
        studentSubjectMarks.put("Student 2", subjectMarks2);

        // Add subjects and marks for student 3
        Map<String, Integer> subjectMarks3 = new HashMap<>();
        subjectMarks3.put("Math", 87);
        subjectMarks3.put("Science", 92);
        subjectMarks3.put("English", 90);
        subjectMarks3.put("Art", 85);
        subjectMarks3.put("Music", 89);
        studentSubjectMarks.put("Student 3", subjectMarks3);

        // Calculate the total marks and exam grade for each student
        List<Student> students = new ArrayList<>();
        for (String studentName : studentSubjectMarks.keySet()) {
            Map<String, Integer> subjectMarks = studentSubjectMarks.get(studentName);
            int totalMarks = 0;
            for (int marks : subjectMarks.values()) {
                totalMarks += marks;
            }
            double averageMarks = (double) totalMarks / subjectMarks.size();
            char examGrade = getExamGrade(averageMarks);
            students.add(new Student(studentName, totalMarks, examGrade));
        }

        // Sort the students by their total marks in descending order
        students.sort((s1, s2) -> s2.getTotalMarks() - s1.getTotalMarks());

        // Print the student ranks
        System.out.println("Student Ranks:");
        int rank = 1;
        for (Student student : students) {
            System.out.println(rank + ". " + student.getName() + ", Total Marks: " + student.getTotalMarks() + ", Exam Grade: " + student.getExamGrade());
            rank++;
        }

        // Find the minimum and maximum marks for each subject
        Map<String, Integer> subjectMaxMarks = new HashMap<>();
        Map<String, Integer> subjectMinMarks = new HashMap<>();
        for (String student : studentSubjectMarks.keySet()) {
            Map<String, Integer> subjectMarks = studentSubjectMarks.get(student);
            for (String subject : subjectMarks.keySet()) {
                int marks = subjectMarks.get(subject);
                if (!subjectMaxMarks.containsKey(subject) || marks > subjectMaxMarks.get(subject)) {
                    subjectMaxMarks.put(subject, marks);
                }
                if (!subjectMinMarks.containsKey(subject) || marks < subjectMinMarks.get(subject)) {
                    subjectMinMarks.put(subject, marks);
                }
            }
        }
    }

    private char getExamGrade(double averageMarks) {

        char grade;

        if(averageMarks >= 90){
            grade = 'A';
        } else if (averageMarks >= 80) {
            grade = 'B';
        } else if (averageMarks >= 70) {
            grade = 'C';
        } else if (averageMarks >= 60) {
            grade = 'D';
        } else if (averageMarks >= 50) {
            grade = 'E';
        } else if (averageMarks >= 40) {
            grade = 'U';
        } else if (averageMarks >= 30){
            grade = 'W';
        } else {
            grade = 'F';
        }

        return grade;
    }
}
