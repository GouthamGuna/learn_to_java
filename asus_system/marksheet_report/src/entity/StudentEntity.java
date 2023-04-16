package entity;

public class StudentEntity {

    private final int id;
    private final String studentName;
    private final String className;
    private final String SpecName;
    private final String sectionName;

    public StudentEntity(int id, String studentName, String className, String specName, String sectionName) {
        this.id = id;
        this.studentName = studentName;
        this.className = className;
        this.SpecName = specName;
        this.sectionName = sectionName;
    }

    public int getId() {
        return id;
    }
    public String getStudentName() {
        return studentName;
    }
    public String getClassName() {
        return className;
    }
    public String getSectionName() {
        return sectionName;
    }
    public String getSpecName() {
        return SpecName;
    }
}
