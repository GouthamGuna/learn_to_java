package in.dev.gmsk.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeService {

    public static void loadEmpDetails() {

       // Comparator<EmployeePojo> empComparator = (i,j) -> i.getAge() > j.getAge() ? 1 : -1;

        List<EmployeePojo> pojos = new ArrayList<>();
        pojos.add(new EmployeePojo("Visithra", 23,1112, 987635241, "visi@gmail.com", "Bangalore"));
        pojos.add(new EmployeePojo("Kavi", 23,113, 987635241, "visi@gmail.com", "Bangalore"));
        pojos.add(new EmployeePojo("Sree", 22,1, 987635241, "visi@gmail.com", "Bangalore"));
        pojos.add(new EmployeePojo("GMSK", 24,45, 987635241, null, "Bangalore"));
        pojos.add(new EmployeePojo("Jay", 24,18, 987635241, "visi@gmail.com", "Bangalore"));
        pojos.add(new EmployeePojo("Kumar", 24,66, 987635241, "visi@gmail.com", "Bangalore"));

        Collections.sort(pojos);

        //System.out.println(pojos);

        pojos.stream().filter(x->x.getEmpMailId() != null)
                .forEach(empDetails -> System.out.println("empDetails = " + empDetails));

    }

}
