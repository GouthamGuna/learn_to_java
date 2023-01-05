package in.gmsk.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(
        name = "student_registration",
        uniqueConstraints = @UniqueConstraint(
                name = "emilId_unique",
                columnNames = "email_address"
        )
)
public class Student {

    @jakarta.persistence.Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy =  GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private int Id;
    private String first_name;
    private String last_name;
    @Column(
            name = "email_address",
            nullable = false
    )
    private String email_id;
    private String parent_name;
    private String parent_mailId;
    private String parent_mobileNo;
}
