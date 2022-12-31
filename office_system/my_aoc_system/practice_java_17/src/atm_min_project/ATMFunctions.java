package atm_min_project;
import java.util.List;

public interface ATMFunctions {

     List<String> addService();

     void chooseService(int whatYouWant);

     int validateUsers(int secret);
}
