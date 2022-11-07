package BusTicketBookingProject;

public class BusDetails {

    private String busCompanyName;
    private String acAreNonAc;
    private int totalCapacity;

    public BusDetails(String busCompanyName, String acAreNonAc, int totalCapacity) {
        this.busCompanyName = busCompanyName;
        this.acAreNonAc = acAreNonAc;
        this.totalCapacity = totalCapacity;
    }

    public String getBusCompanyName() {
        return busCompanyName;
    }

    public void setBusCompanyName(String busCompanyName) {
        this.busCompanyName = busCompanyName;
    }

    public String getAcAreNonAc() {
        return acAreNonAc;
    }

    public void setAcAreNonAc(String acAreNonAc) {
        this.acAreNonAc = acAreNonAc;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    @Override
    public String toString() {
        return "BusDetails{" +
                "busCompanyName='" + busCompanyName + '\'' +
                ", acAreNonAc='" + acAreNonAc + '\'' +
                ", totalCapacity='" + totalCapacity + '\'' +
                '}';
    }
}
