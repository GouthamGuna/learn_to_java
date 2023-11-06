package in.dev.gmsk.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Setter
@Getter
@ToString
public class EmployeeGroupByModel {

    private int id;
    private String name;
    private long salary;
    private GroupByModel groupBy;
}
