package entity;

public class Subject {

    private String subjectName;
    private int subjectMark;

    public Subject(String subjectName, int subjectMark) {
        this.subjectName = subjectName;
        this.subjectMark = subjectMark;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectMark() {
        return subjectMark;
    }

    public void setSubjectMark(int subjectMark) {
        this.subjectMark = subjectMark;
    }
}
