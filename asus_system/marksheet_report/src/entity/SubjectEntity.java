package entity;

public class SubjectEntity {

    private String subjectName;
    private String subjectCode;
    private String maxMark;
    private String minMark;

    public SubjectEntity(String subjectName, String subjectCode, String maxMark, String minMark) {
        this.subjectName = subjectName;
        this.subjectCode = subjectCode;
        this.maxMark = maxMark;
        this.minMark = minMark;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getMaxMark() {
        return maxMark;
    }

    public void setMaxMark(String maxMark) {
        this.maxMark = maxMark;
    }

    public String getMinMark() {
        return minMark;
    }

    public void setMinMark(String minMark) {
        this.minMark = minMark;
    }
}
