package in.cerpsoft.app.dto;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;

@Data
@Entity
@Table(name = "client_details")
public class ClientDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private String gender;
    private String mobileNo;
    private String emailId;
    private String address;
    private String country;
    private String state;
    private String city;
    private String pinCode;
    private String purchaseType;
    private Date licenseStartDate;
    private Date licenseExpiredDate;
    private String licenseKey;
    private String domainName;
    private Timestamp createDate;
}
