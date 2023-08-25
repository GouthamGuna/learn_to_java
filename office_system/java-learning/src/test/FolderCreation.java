package test;

import java.io.File;
import java.io.FileWriter;

public class FolderCreation {

    public static void main(String[] args) {
        FileWriter fileWriter = null;

        try {

            File file = new File("C:/Users/User/Desktop/GMSK_Key/");
            System.out.println("Before : " + file.exists());

            if (!file.exists()) {
                file.mkdir();
                System.out.println("After : " + file.exists());
            }

            fileWriter = new FileWriter(file + "/key.txt");
            fileWriter.write("66518618248CA78AA4372E2F36782");
            System.out.println("Successfully Key wrote to the file.");

        }catch (Exception e){
            System.out.println("Something Went Wrong.... "+e.getMessage());
        }finally {
            try{
                fileWriter.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
