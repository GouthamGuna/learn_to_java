package in.dev.gmsk.model;

import in.dev.gmsk.annotations.Important;
import in.dev.gmsk.annotations.ImportantString;
import in.dev.gmsk.annotations.RunImmediately;

@Important
public class User {

    @ImportantString
    private String name;
    private String userId;
    private String userGender;

    public User(String name, String userId, String userGender) {
        this.name = name;
        this.userId = userId;
        this.userGender = userGender;
    }

    @RunImmediately()
    public void getName() {
        System.out.println("name = "+name);
    }

    @RunImmediately(times = 3)
    public void getUserId() {
        System.out.println("userId = "+userId);
    }

    public void getUserGender() {
        System.out.println("userGender = "+userGender);
    }
}
