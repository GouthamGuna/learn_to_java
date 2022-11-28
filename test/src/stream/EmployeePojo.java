package stream;

public class EmployeePojo {

    private final int id;
    private final String name;
    private final long salary;

    public EmployeePojo(int id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public long getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "EmployeePojo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
