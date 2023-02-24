package in.cerpsoft.app.dto;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "setup_school")
public class SchoolDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String address1;
    private String address2;
    private String schoolName;
    private String schoolAffiliationNo;
    private String mobileNo;
    private String landLineNo;
    private String country;
    private String state;
    private String city;
    private String pinCode;
    private String schoolLogo;
    private String contactPerson;
    private String website;
    private String emailId;
    private String personalEmailId;

}
