package in.cerpsoft.app.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
@Entity
@Table(name = "school_details")
public class SchoolDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotEmpty(message = "Address shouldn't be empty.")
    private String address;
    @NotNull(message = "The school name shouldn't be null.")
    @NotEmpty(message = "Enter the name of the school.")
    private String schoolName;
    @NotEmpty(message = "Affiliation no shouldn't be empty.")
    private String schoolAffiliationNo;
    @NotNull(message = "Mobile no. Shouldn't be null.")
    @Pattern(regexp = "^\\d{10}$", message = "Invalid Mobile no")
    private String mobileNo;
    private String landLineNo;
    @NotEmpty(message = "Country shouldn't be empty.")
    private String country;
    @NotEmpty(message = "State shouldn't be empty.")
    private String state;
    @NotEmpty(message = "City shouldn't be empty.")
    private String city;
    @NotEmpty(message = "Pin Code shouldn't be empty.")
    private String pinCode;
    @NotEmpty(message = "School Logo shouldn't be empty.")
    private String schoolLogo;
    @NotEmpty(message = "Contact Person shouldn't be empty.")
    @Pattern(regexp = "^\\d{10}$", message = "Invalid Mobile no.")
    private String contactPerson;
    @NotEmpty(message = "Website shouldn't be empty.")
    private String website;
    @Email(message = "Email is not valid", regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")
    @NotEmpty(message = "Email cannot be empty.")
    private String emailId;
    @Email(message = "Personal Email is not valid" , regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")
    @NotEmpty(message = "Personal Email cannot be empty.")
    private String personalEmailId;

    @OneToOne(mappedBy = "schoolDto")
    private BranchDto BranchDto;
}
