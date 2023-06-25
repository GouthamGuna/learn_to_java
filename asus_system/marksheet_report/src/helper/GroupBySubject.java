package helper;

import entity.Subject;

import java.util.*;

class StudentDetails {
    String name;
    String subject;
    int marks;

    public StudentDetails(String name, String subject, int marks) {
        this.name = name;
        this.subject = subject;
        this.marks = marks;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", marks=" + marks +
                '}';
    }
}
public class GroupBySubject {

    /*public static Map<Integer, String> getStudentMark(){

        Map<Integer, String> subjects1 = new HashMap<>();
        subjects1.put(60, "Math");
        subjects1.put(50, "Science");
        subjects1.put(80, "English");
        subjects1.put(86, "Art");
        subjects1.put(90, "Music");

        return subjects1;
    }

    public static String groupOfSubjectName(int key){

        Map<Integer, String> subjects1 = new HashMap<>();
        subjects1.put(60, "Math");
        subjects1.put(50, "Science");
        subjects1.put(80, "English");
        subjects1.put(86, "Art");
        subjects1.put(90, "Music");

        return subjects1.get(key);
    }*/


    public static void main(String[] args) {

        List<Subject> students = new ArrayList<>();
        students.add(new Subject("Tamil", 90));
        students.add(new Subject("English", 60));
        students.add(new Subject("Maths", 80));
        students.add(new Subject("Social", 99));
        students.add(new Subject("Social Science", 89));

        students.sort(new Comparator<Subject>() {
            @Override
            public int compare(Subject s1, Subject s2) {
                return s1.getSubjectName().compareTo(s2.getSubjectName());
            }
        });

        for (Subject student : students) {
            if (student.getSubjectMark() >= 80 && student.getSubjectMark() <= 100) {
                System.out.println(student.getSubjectName());
            }
        }
    }
}
