package student_inherit;

public class HelperClass {

    public Student[] getStudentList() {

        int count = 700;
        Student student1 = new Student("Karan", ++count, 99, 90, 80, 85, 87);
        Student student2 = new Student("Jay", ++count, 80, 70, 85, 90, 99);
        Student student3 = new Student("Kumar", ++count, 99, 88, 77, 86, 94);
        Student student4 = new Student("Manoj", ++count, 98, 44, 50, 60, 88);
        Student student5 = new Student("Mohan", ++count, 80, 50, 55, 44, 60);
        Student student6 = new Student("Meenakshi", ++count, 70, 60, 45, 85, 77);
        Student student7 = new Student("Sonia", ++count, 99, 90, 80, 85, 87);
        Student student8 = new Student("Sreeja", ++count, 95, 80, 60, 77, 98);
        Student student9 = new Student("Meera", ++count, 60, 80, 60, 40, 40);
        Student student10 = new Student("CiBi", ++count, 70, 90, 66, 85, 77);

        Student[] arrOfStudent = new Student[10];
        arrOfStudent[0] = student1;
        arrOfStudent[1] = student2;
        arrOfStudent[2] = student3;
        arrOfStudent[3] = student4;
        arrOfStudent[4] = student5;
        arrOfStudent[5] = student6;
        arrOfStudent[6] = student7;
        arrOfStudent[7] = student8;
        arrOfStudent[8] = student9;
        arrOfStudent[9] = student10;

        return arrOfStudent;
    }

}
