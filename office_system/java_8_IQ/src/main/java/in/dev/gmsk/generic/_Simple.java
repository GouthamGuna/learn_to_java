package in.dev.gmsk.generic;

import in.dev.gmsk.model.Employee;

public class _Simple {

    public static void main(String[] args) {
        print("Hello Lunar!");

        int a = 3;
        a += 2;
        print(a);

        printObjectValue("Hello Lunar!", a);

        Employee employee = new Employee();
        employee.setId(202424);
        employee.setName("Kavin");
        employee.setGender("Male");
        employee.setDesignation("Developer");
        employee.setSalary(600000);

        printObjectValue(employee, employee.getId());

        update(employee);
    }

    static <T> void print(T value) {
        System.out.println("value = " + value);
    }

    static <T, U> void printObjectValue(T t, U u) {
        System.out.println("t = " + t + "\tU = " + u);
    }

    static <T> void update(T value) {
        System.out.println(value.getClass());
    }
}
