package in.dev.gmsk.employee;

public class EmployeePojo implements Comparable<EmployeePojo> {

    private String empName;
    private float age;
    private long   empId;
    private long   empMobileNo;
    private String empMailId;
    private String empAddress;

    public EmployeePojo(String empName, float age, long empId, long empMobileNo, String empMailId, String empAddress) {
        this.empName = empName;
        this.age = age;
        this.empId = empId;
        this.empMobileNo = empMobileNo;
        this.empMailId = empMailId;
        this.empAddress = empAddress;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public long getEmpMobileNo() {
        return empMobileNo;
    }

    public void setEmpMobileNo(long empMobileNo) {
        this.empMobileNo = empMobileNo;
    }

    public String getEmpMailId() {
        return empMailId;
    }

    public void setEmpMailId(String empMailId) {
        this.empMailId = empMailId;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\n EmployeePojo{" +
                "empName='" + empName + '\'' +
                ", age=" + age +
                ", empId=" + empId +
                ", empMobileNo=" + empMobileNo +
                ", empMailId='" + empMailId + '\'' +
                ", empAddress='" + empAddress + '\'' +
                '}';
    }

    @Override
    public int compareTo(EmployeePojo that) {
        return this.empId > that.empId ? 1 : -1;
    }
}
