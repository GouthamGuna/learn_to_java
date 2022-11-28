package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LearnSortInStream {
    public static void main(String[] args) {

        List<EmployeePojo> empList=new ArrayList<>();

        empList.add(new EmployeePojo(1, "Sathaya", 10000));
        empList.add(new EmployeePojo(2, "Raja", 20000));
        empList.add(new EmployeePojo(3, "Rani", 30000));
        empList.add(new EmployeePojo(4, "Kesore", 40000));
        empList.add(new EmployeePojo(5, "Soniya", 50000));
        empList.add(new EmployeePojo(6, "Main", 60000));

        List<EmployeePojo> collect = empList.stream()
                .sorted((e1, e2) -> (int) (e2.getSalary() - e1.getSalary()))
                .collect(Collectors.toList());

        System.out.println(collect);

        List<String> obj= Arrays.asList("g", "m", "s", "k");

        System.out.println(obj);
    }
}
