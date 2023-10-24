package in.dev.gmsk.keywords;

import java.io.Serializable;

public class UserLoginAccess implements Serializable {

    String username;
    transient String password; //Now it will not be serialized

    public UserLoginAccess(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
