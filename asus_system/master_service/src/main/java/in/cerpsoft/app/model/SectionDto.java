package in.cerpsoft.app.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Date;

@Data
@Entity
@Table(name = "section_tbl")
public class SectionDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String branch;
    @NotNull(message = "The section name shouldn't be null.")
    @NotEmpty(message = "Enter the name of the section.")
    private String sectionName;
    @Column(columnDefinition = "char default 'Y'")
    private char isActive;
    private String remarks;
    private String createUser;
    private String modifyUser;
    @UpdateTimestamp
    private Date modifyDate;
}
