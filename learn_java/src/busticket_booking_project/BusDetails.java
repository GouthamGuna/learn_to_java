package busticket_booking_project;

public class BusDetails {

    private int busNo;
    private String busCompanyName;
    private String acAreNonAc;
    private int totalCapacity;

    public BusDetails(int busNo, String busCompanyName, String acAreNonAc, int totalCapacity) {
        this.busNo = busNo;
        this.busCompanyName = busCompanyName;
        this.acAreNonAc = acAreNonAc;
        this.totalCapacity = totalCapacity;
    }

    public int getBusNo() {
        return busNo;
    }

    public void setBusNo(int busNo) {
        this.busNo = busNo;
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
                "busNo=" + busNo +
                ", busCompanyName='" + busCompanyName + '\'' +
                ", acAreNonAc='" + acAreNonAc + '\'' +
                ", totalCapacity=" + totalCapacity +
                '}';
    }
}
