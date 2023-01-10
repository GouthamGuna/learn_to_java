package in.gmsk.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@AttributeOverrides({
        @AttributeOverride(
                name = "name",
                column = @Column(name = "guardianName")
        ),
        @AttributeOverride(
                name="mailId",
                column = @Column(name = "guardianMailAddress")
        ),
        @AttributeOverride(
                name = "mobileNo",
                column = @Column(name = "guardianMobilNO")
        )
})
public class Guardian {

    private String name;
    private String mailId;
    private String mobileNo;
}
