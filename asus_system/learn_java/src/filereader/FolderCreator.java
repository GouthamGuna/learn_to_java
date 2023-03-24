package filereader;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FolderCreator {
    public static void main(String[] args) {

        String folderPath = "D:/Test";

        File folder = new File(folderPath);
        if(!folder.exists()){
            folder.mkdir();
            System.out.println("folder create sussfully.");
        }

        Date date =new Date();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String todayDate = format.format(date);

        String logFile = "D:/Test/file "+todayDate+".log";

        String logFilePath =logFile;

        try{

            FileWriter writer = new FileWriter(logFilePath, true);
            writer.write("Email Send SuccessFully.\n");
            writer.close();

        }catch (IOException e){

            e.printStackTrace();

        }

    }
}
