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
    private Map<String, List<String>> teacherSubjects;

    public TimeTableGenerator(int numDays, int numPeriods, List<String> teachers, List<String> subjects, Map<String, List<String>> teacherSubjects) {
        this.numDays = numDays;
        this.numPeriods = numPeriods;
        this.teachers = teachers;
        this.subjects = subjects;
        this.teacherSubjects = teacherSubjects;
    }

    public String[][][] generate() {
        String[][][] timeTable = new String[numDays][numPeriods][2];
        Map<String, Integer> subjectCount = new HashMap<>();

        for (String subject : subjects) {
            subjectCount.put(subject, 0);
        }

        for (int day = 0; day < numDays; day++) {
            for (int period = 0; period < numPeriods; period++) {
                String subject = getSubjectWithLeastCount(subjectCount);
                String teacher = getTeacherForSubject(subject);
                timeTable[day][period][0] = subject;
                timeTable[day][period][1] = teacher;
                subjectCount.put(subject, subjectCount.get(subject) + 1);
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

    private String getTeacherForSubject(String subject) {
        for (Map.Entry<String, List<String>> entry : teacherSubjects.entrySet()) {
            if (entry.getValue().contains(subject)) {
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
        Map<String, List<String>> teacherSubjects = new HashMap<>();
        teacherSubjects.put("Ms. Smith", new ArrayList<>());
        teacherSubjects.get("Ms. Smith").add("Math");
        teacherSubjects.put("Mr. Johnson", new ArrayList<>());
        teacherSubjects.get("Mr. Johnson").add("Science");
        teacherSubjects.put("Mrs. Williams", new ArrayList<>());
        teacherSubjects.get("Mrs. Williams").add("English");

        TimeTableGenerator generator = new TimeTableGenerator(numDays, numPeriods, teachers, subjects, teacherSubjects);
        String[][][] timeTable = generator.generate();
        for (int day = 0; day < numDays; day++) {
            System.out.println("Day " + (day + 1));
            for (int period = 0; period < numPeriods; period++) {
                System.out.println("Period " + (period + 1) + ": " + timeTable[day][period][0] + " - " + timeTable[day][period][1]);
            }
            System.out.println();
        }
    }
}
