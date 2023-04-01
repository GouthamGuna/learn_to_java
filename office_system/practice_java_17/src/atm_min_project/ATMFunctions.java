package atm_min_project;

import java.util.List;

public interface ATMFunctions {

     void addService();

     void chooseService(int whatYouWant);

     int validateUsers(int secret);

     List<UserPojo> findByUser(int secret);

     int countLength(int secret);
}
