package in.dev.gmsk.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Setter
@Getter
@ToString
public class Employee {

    private int id;
    private String name;
    private String designation;
    private String gender;
    private double salary;
}
