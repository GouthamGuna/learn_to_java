package in.cerpsoft.app.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Date;

@Data
@Entity
@Table(name = "branch_tbl")
public class BranchDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotEmpty(message = "Address shouldn't be empty.")
    private String address;
    @NotNull(message = "The school name shouldn't be null.")
    @NotEmpty(message = "Enter the name of the school.")
    private String schoolName;
    @NotEmpty(message = "Branch name shouldn't be empty.")
    private String branchName;
    @NotEmpty(message = "Board Type shouldn't be empty.")
    private String boardType;
    @NotEmpty(message = "Affiliated To shouldn't be empty.")
    private String affiliatedTo;
    @NotNull(message = "Mobile no. Shouldn't be null.")
    @Pattern(regexp = "^\\d{10}$", message = "Invalid Mobile no")
    private String mobileNo;
    @NotEmpty(message = "Branch Code shouldn't be empty.")
    private String branchCode;
    @NotEmpty(message = "Country shouldn't be empty.")
    private String country;
    @NotEmpty(message = "State shouldn't be empty.")
    private String state;
    @NotEmpty(message = "City shouldn't be empty.")
    private String city;
    @NotEmpty(message = "Pin Code shouldn't be empty.")
    private String pinCode;
    @NotEmpty(message = "Branch Logo shouldn't be empty.")
    private String branchLogo;
    @NotEmpty(message = "Principal Mobile shouldn't be empty.")
    @Pattern(regexp = "^\\d{10}$", message = "Invalid Mobile no.")
    private String principalMobile;
    @NotEmpty(message = "Website shouldn't be empty.")
    private String website;
    @Email(message = "Email is not valid", regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")
    @NotEmpty(message = "Email cannot be empty.")
    private String emailId;
    @Email(message = "Principal Email is not valid" , regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")
    @NotEmpty(message = "Principal Email cannot be empty.")
    private String principalEmailId;
    @NotNull(message = "The school id shouldn't be null.")
    private String schoolId;
    @Column(columnDefinition = "char default 'Y'")
    private char isActive;
    private String remarks;
    private String createUser;
    private String modifyUser;
    @UpdateTimestamp
    private Date modifyDate;
}
