package in.dev.gmsk.keywords.transient_kw;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationMainMethod {

    public static void main(String[] args) {

        try{

            ObjectInputStream inputStream =
                    new ObjectInputStream(new FileInputStream("C:\\Users\\User\\Desktop\\log\\UserLoginAccess.txt"));

            UserLoginAccess userLoginAccess = (UserLoginAccess) inputStream.readObject();

            System.out.println("UserName : "+userLoginAccess.username+" Password : "+userLoginAccess.password);
            inputStream.close();

        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
