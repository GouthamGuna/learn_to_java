package in.dev.gmsk.keywords.transient_kw;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * In Java Serializable used to convert an object into a stream of the byte.
 * <p>
 * File file = new File("C:/Users/GMSK_Key/");
 * //System.out.println("Before : " + file.exists());
 * <p>
 * if (!file.exists()) {
 * file.mkdir();
 * // System.out.println("After : " + file.exists());
 * }
 * <p>
 * FileWriter fileWriter = new FileWriter(file + "/key.txt");
 **/

public class SerializationMainMethod {
    public static void main(String[] args) {

        try {

            UserLoginAccess userLoginAccess =
                    new UserLoginAccess("admin@tcs", "gmsk@tcs.dev");

            FileOutputStream fileOutputStream =
                    new FileOutputStream("C:\\Users\\User\\Desktop\\log\\UserLoginAccess.txt");

            ObjectOutputStream objectOutputStream =
                    new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(userLoginAccess);
            objectOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("success to writing the object.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
