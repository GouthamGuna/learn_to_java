package in.dev.gmsk.cabs_booking_app;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class CabModel implements Cloneable {

    private char currentLocation = 'A';
    private long cabId;
    private long customerId;
    private char pickupLocation;
    private char dropLocation;
    private long pickupTime;
    private long dropTime;
    private long earnings;

    @Override
    public CabModel clone() {
        try {
            CabModel clonedCabModel = (CabModel) super.clone();
            clonedCabModel.currentLocation = this.currentLocation;
            clonedCabModel.cabId = this.cabId;
            clonedCabModel.customerId = this.customerId;
            clonedCabModel.pickupLocation = this.pickupLocation;
            clonedCabModel.dropLocation = this.dropLocation;
            clonedCabModel.pickupTime = this.pickupTime;
            clonedCabModel.dropTime = this.dropTime;
            clonedCabModel.earnings = this.earnings;
            return clonedCabModel;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
