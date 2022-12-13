package streamAPI;

public class EmployeePojo {

    private String empName;
    private String empGender;
    private String empDepartment;
    private int empSalary;
    private int empAge;

    public EmployeePojo(String empName, String empGender, String empDepartment, int empSalary, int empAge) {
        this.empName = empName;
        this.empGender = empGender;
        this.empDepartment = empDepartment;
        this.empSalary = empSalary;
        this.empAge=empAge;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpGender() {
        return empGender;
    }

    public void setEmpGender(String empGender) {
        this.empGender = empGender;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    @Override
    public String toString() {
        return "EmployeePojo{" +
                "empName='" + empName + '\'' +
                ", empGender='" + empGender + '\'' +
                ", empDepartment='" + empDepartment + '\'' +
                ", empSalary='" + empSalary + '\'' +
                ", empAge='" + empAge + '\'' +
                '}';
    }
}
