package timetable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeTableGenerator {
    private int numDays;
    private int numPeriods;
    private List<String> teachers;
    private List<String> subjects;
    private List<String> classes;
    private Map<String, List<String>> teacherSubjects;
    private Map<String, List<String>> teacherClasses;

    public TimeTableGenerator(int numDays, int numPeriods, List<String> teachers, List<String> subjects, List<String> classes, Map<String, List<String>> teacherSubjects, Map<String, List<String>> teacherClasses) {
        this.numDays = numDays;
        this.numPeriods = numPeriods;
        this.teachers = teachers;
        this.subjects = subjects;
        this.classes = classes;
        this.teacherSubjects = teacherSubjects;
        this.teacherClasses = teacherClasses;
    }

    public String[][][][] generate() {
        String[][][][] timeTable = new String[numDays][numPeriods][classes.size()][3];
        Map<String, Integer> subjectCount = new HashMap<>();
        for (String subject : subjects) {
            subjectCount.put(subject, 0);
        }
        for (int day = 0; day < numDays; day++) {
            for (int period = 0; period < numPeriods; period++) {
                for (int classIndex = 0; classIndex < classes.size(); classIndex++) {
                    String subject = getSubjectWithLeastCount(subjectCount);
                    String teacher = getTeacherForSubjectAndClass(subject, classes.get(classIndex));
                    timeTable[day][period][classIndex][0] = subject;
                    timeTable[day][period][classIndex][1] = teacher;
                    timeTable[day][period][classIndex][2] = classes.get(classIndex);
                    subjectCount.put(subject, subjectCount.get(subject) + 1);
                }
            }
        }
        return timeTable;
    }

    private String getSubjectWithLeastCount(Map<String, Integer> subjectCount) {
        String minSubject = null;
        int minCount = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> entry : subjectCount.entrySet()) {
            if (entry.getValue() < minCount) {
                minSubject = entry.getKey();
                minCount = entry.getValue();
            }
        }
        return minSubject;
    }

    private String getTeacherForSubjectAndClass(String subject, String className) {
        for (Map.Entry<String, List<String>> entry : teacherSubjects.entrySet()) {
            if (entry.getValue().contains(subject) && teacherClasses.get(entry.getKey()).contains(className)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int numDays = 5;
        int numPeriods = 8;
        List<String> teachers = new ArrayList<>();
        teachers.add("Ms. Smith");
        teachers.add("Mr. Johnson");
        teachers.add("Mrs. Williams");

        List<String> subjects = new ArrayList<>();
        subjects.add("Math");
        subjects.add("Science");
        subjects.add("English");

        List<String> classes = new ArrayList<>();
        classes.add("Class A");
        classes.add("Class B");

        Map<String, List<String>> teacherSubjects = new HashMap<>();
        teacherSubjects.put("Ms. Smith", new ArrayList<>());
        teacherSubjects.get("Ms. Smith").add("Math");
        teacherSubjects.put("Mr. Johnson", new ArrayList<>());
        teacherSubjects.get("Mr. Johnson").add("Science");
        teacherSubjects.put("Mrs. Williams", new ArrayList<>());
        teacherSubjects.get("Mrs. Williams").add("English");

        Map<String, List<String>> teacherClasses = new HashMap<>();
        teacherClasses.put("Ms. Smith", new ArrayList<>());
        teacherClasses.get("Ms. Smith").add("Class A");
        teacherClasses.put("Mr. Johnson", new ArrayList<>());
        teacherClasses.get("Mr. Johnson").add("Class A");
        teacherClasses.put("Mrs. Williams", new ArrayList<>());
        teacherClasses.get("Mrs. Williams").add("Class B");

        TimeTableGenerator generator = new TimeTableGenerator(numDays, numPeriods, teachers, subjects, classes, teacherSubjects, teacherClasses);
        String[][][][] timeTable = generator.generate();
        for (int day = 0; day < numDays; day++) {
            System.out.println("Day " + (day + 1));
            for (int period = 0; period < numPeriods; period++) {
                System.out.println("Period " + (period + 1));
                for (int classIndex = 0; classIndex < classes.size(); classIndex++) {
                    System.out.println(timeTable[day][period][classIndex][2] + ": " + timeTable[day][period][classIndex][0] + " - " + timeTable[day][period][classIndex][1]);
                }
            }
            System.out.println();
        }
    }
}