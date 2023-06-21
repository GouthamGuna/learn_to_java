package student_inherit;

public class Student {

    private String studentName;
    private int studentRollNo;
    private int tamil;
    private int english;
    private int maths;
    private int science;
    private int socialScience;

    public Student(String studentName, int studentRollNo, int tamil, int english, int maths, int science, int socialScience) {
        this.studentName = studentName;
        this.studentRollNo = studentRollNo;
        this.tamil = tamil;
        this.english = english;
        this.maths = maths;
        this.science = science;
        this.socialScience = socialScience;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentRollNo() {
        return studentRollNo;
    }

    public int getTamil() {
        return tamil;
    }

    public int getEnglish() {
        return english;
    }

    public int getMaths() {
        return maths;
    }

    public int getScience() {
        return science;
    }

    public int getSocialScience() {
        return socialScience;
    }

    @Override
    public String toString() {
        return " \n Student {" +
                "studentName='" + studentName + '\'' +
                ", studentRollNo='" + studentRollNo + '\'' +
                ", tamil='" + tamil + '\'' +
                ", english='" + english + '\'' +
                ", maths='" + maths + '\'' +
                ", science='" + science + '\'' +
                ", socialScience='" + socialScience + '\'' +
                '}';
    }
}
