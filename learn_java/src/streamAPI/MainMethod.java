package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainMethod {
    public static void main(String[] args) {

        List<EmployeePojo> addData=new ArrayList<>();
        addData.add(new EmployeePojo("Jay", "M", "IT", 10000,23));
        addData.add(new EmployeePojo("Kumar", "M","IT", 10000,23));
        addData.add(new EmployeePojo("Sonya","FM","Sales",10000,30));
        addData.add(new EmployeePojo("Sathaya","FM","Sales",90000,27));
        addData.add(new EmployeePojo("Gowtham","M","HR",80000,27));

       /* for (EmployeePojo split: addData){
            System.out.println(split);
        }*/

        List<String> empName=addData.stream()
                        .filter(s-> s.getEmpDepartment() == "IT")
                        .map(n-> n.getEmpName())
                        .collect(Collectors.toList());

        System.out.println(empName);
    }
}
