package in.gmsk.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @NotBlank
    @NotEmpty(message = "please provide the mailId.")
    private String userMailId;
    @NotNull
    @NotBlank
    @Size(min = 2, max = 30)
    @NotEmpty(message = "please provide the user name.")
    private String userName;
    @NotNull
    @NotBlank
    @Min(8)
    @NotEmpty(message = "please provide the password.")
    private String secret;
}
