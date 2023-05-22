package in.cerpsoft.app.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Date;

@Data
@Entity
@Table(name = "academic_year_tbl")
public class AcademicYearDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull(message = "The start date shouldn't be null.")
    @NotEmpty(message = "Enter the date of the start.")
    private String startDate;
    private String endDate;
    private String academicYear;
    @Column(columnDefinition = "char default 'Y'")
    private char isActive;
    private String createUser;
    private String modifyUser;
    @UpdateTimestamp
    private Date modifyDate;
}
