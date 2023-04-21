package entity;

public class Student {

    private final String name;

    private final int totalMarks;

    private final char examGrade;

    public Student(String name, int totalMarks, char examGrade) {
        this.name = name;
        this.totalMarks = totalMarks;
        this.examGrade = examGrade;
    }

    public char getExamGrade() {
        return examGrade;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public String getName() {
        return name;
    }
}
