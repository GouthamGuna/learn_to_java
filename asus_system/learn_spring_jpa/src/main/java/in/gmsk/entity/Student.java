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
                columnNames = "emailAddress"
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
    private String firstName;
    private String lastName;
    @Column(
            name = "emailAddress",
            nullable = false
    )
    private String email_id;

    @Embedded
    private Guardian guardian;
}
