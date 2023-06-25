package helper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentGrades {
    public static void main(String[] args) {
        // Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", "Math", 85));
        students.add(new Student("Bob", "Math", 95));
        students.add(new Student("Charlie", "English", 90));
        students.add(new Student("Dave", "English", 75));
        students.add(new Student("Eve", "Science", 80));

        // Group students by subject
        Map<String, List<Student>> subjectGroups = new HashMap<>();
        for (Student student : students) {
            String subject = student.getSubject();
            if (!subjectGroups.containsKey(subject)) {
                subjectGroups.put(subject, new ArrayList<>());
            }
            subjectGroups.get(subject).add(student);
        }

        // Display students who scored between 80 and 100
        for (Map.Entry<String, List<Student>> entry : subjectGroups.entrySet()) {
            String subject = entry.getKey();
            //List<Student> subjectStudents = entry.getValue();
            System.out.println("Subject: " + subject);
        }
    }

    private static class Student {
        private String name;
        private String subject;
        private int score;

        public Student(String name, String subject, int score) {
            this.name = name;
            this.subject = subject;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public String getSubject() {
            return subject;
        }

        public int getScore() {
            return score;
        }
    }
}
