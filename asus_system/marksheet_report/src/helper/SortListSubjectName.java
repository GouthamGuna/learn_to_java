package helper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1 {
    String name;
    String subject;
    int marks;

    public Student1(String name, String subject, int marks) {
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

public class SortListSubjectName {

    public static void main(String[] args) {

        List<Student1> students = new ArrayList<>();
        students.add(new Student1("Alice", "Maths", 85));
        students.add(new Student1("Bob", "Science", 75));
        students.add(new Student1("Charlie", "English", 95));
        students.add(new Student1("Dave", "History", 80));

        Collections.sort(students, new Comparator<Student1>() {
            @Override
            public int compare(Student1 s1, Student1 s2) {
                return s1.subject.compareTo(s2.subject);
            }
        });

        for (Student1 student : students) {
            if (student.marks >= 80 && student.marks <= 100) {
                System.out.println(student);
            }
        }
    }
}
