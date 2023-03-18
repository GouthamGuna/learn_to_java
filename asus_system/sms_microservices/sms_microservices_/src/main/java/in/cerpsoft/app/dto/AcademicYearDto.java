package in.cerpsoft.app.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name = "academic_year_details")
public class AcademicYearDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull(message = "The start date shouldn't be null.")
    @NotEmpty(message = "Enter the date of the start..")
    private Date startDate;
    private Date EndDate;
    private String AcademicYear;
}
