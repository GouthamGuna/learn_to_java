package atm_min_project;

public class ATMController extends ATMService{

    public void getData(String localDateTime){
        System.out.println("Date : "+localDateTime);
    }
    @Override
    public void addService() {
        super.addService();
    }
    @Override
    public void chooseService(int whatYouWant) {
        super.chooseService(whatYouWant);
    }
}
