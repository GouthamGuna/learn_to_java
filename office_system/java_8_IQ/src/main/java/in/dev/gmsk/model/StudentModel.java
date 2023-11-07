package in.dev.gmsk.model;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class StudentModel {

    private String id;
    private String name;
    private String gender;
    private String dob;
    private String studentAvatar;
    private String admissionNo;
}
