package in.gmsk.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity
@Data
@Table(name = "travels_owner_details")
public class RegistrationTravelOwner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @NotBlank(message = "Travels name shouldn't be empty")
    private String travelsName;

    @NotNull(message = "Owner name shouldn't be null")
    @NotBlank(message = "Owner name shouldn't be empty")
    private String ownerName;

    @NotNull(message = "Manager name shouldn't be null")
    @NotBlank(message = "Manager name shouldn't be empty")
    private String managerName;

    @NotNull(message = "Owner mailId shouldn't be null")
    @NotBlank(message = "Owner mailId shouldn't be empty")
    @Email(message = "Email is not valid", regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")
    private String ownerMailId;

    @NotNull(message = "Manager mailId shouldn't be null")
    @NotBlank(message = "Manager mailId shouldn't be empty")
    @Email(message = "Email is not valid", regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")
    private String managerMailId;

    @NotNull(message = "Owner mobile no shouldn't be null")
    @NotBlank(message = "Owner mobile no shouldn't be empty")
    @Pattern(regexp = "^\\d{10}$", message = "Invalid Mobile no")
    private String ownerMobileNo;

    @NotNull(message = "Manager mobile no shouldn't be null")
    @NotBlank(message = "Manager mobile no shouldn't be empty")
    @Pattern(regexp = "^\\d{10}$", message = "Invalid Mobile no")
    private String managerMobileNo;

    @NotNull(message = "Owner address shouldn't be null")
    @NotBlank(message = "Owner address shouldn't be empty")
    private String ownerAddress;

    @NotNull(message = "Manager address shouldn't be null")
    @NotBlank(message = "Manager address shouldn't be empty")
    private String mangerAddress;
}
