package in.gmsk.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "parent")
public class ParentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String studentId;
    private String name;
    private String mobileNo;
    private String mailId;
}
