package stream_api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student { // implements Comparable<Student>

    String name;
    int studentRollNo;

    public Student(String name, int studentRollNo) {
        this.name = name;
        this.studentRollNo = studentRollNo;
    }

    @Override
    public String toString() {
        return "\n Student{" +
                "name='" + name + '\'' +
                ", studentRollNo=" + studentRollNo +
                '}';
    }

    /*@Override
    public int compareTo(Student that) {
        if(this.studentRollNo > that.studentRollNo) return 1;
        else return -1;
    }*/
}

public class ComparatorComparable {

    public static void main(String[] args) {

        /*Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                if(o1 % 10 > o2 % 10) {  // getLastNumber
                    return 1;
                }
                else {
                    return -1;
                }
            }
        };*/

        List<Integer> numbers = new ArrayList<>();
        numbers.add(43);
        numbers.add(31);
        numbers.add(72);
        numbers.add(29);

       /* Collections.sort(numbers, comparator);

        System.out.println(numbers);*/

        Comparator<Student> compStudent = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {

                if(o1.studentRollNo > o2.studentRollNo) {
                    return 1;
                }
                else {
                    return -1;
                }
            }
        };

        Comparator<Student> compStudentLambdaFunction =
                (o1,  o2) -> o1.studentRollNo > o2.studentRollNo ? 1 : -1;


        List<Student> students = new ArrayList<>();
        students.add(new Student("Hari", 10));
        students.add(new Student("Kavi", 1));
        students.add(new Student("Visi", 66));
        students.add(new Student("Sree", 36));
        students.add(new Student("Kiran", 24));

        //Collections.sort(students, compStudent);

        // Collections.sort(students); // Using implements Comparable<Student> in class level using the method compareTo().

        Collections.sort(students, compStudentLambdaFunction);

        System.out.println(students);
    }
}
