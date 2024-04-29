package in.dev.gmsk.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class Staff { // implements Comparable<Staff>

    String name;
    BigDecimal salary;

    /*@Override
    public int compareTo(Staff that) {
        return this.salary > that.salary ? 1 : -1;
    }*/
}
