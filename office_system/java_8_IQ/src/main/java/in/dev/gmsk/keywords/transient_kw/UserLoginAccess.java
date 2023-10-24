package in.dev.gmsk.keywords.transient_kw;

import java.io.*;


class UserLoginAccess implements Serializable {

    String username;
    transient String password; //Now it will not be serialized

    public UserLoginAccess(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
