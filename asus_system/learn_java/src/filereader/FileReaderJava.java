package filereader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderJava {
    public static void main(String[] args) throws IOException {

        FileReader fileReader=new FileReader("cat.txt");
        int data = fileReader.read();

        while (data !=-1){
            System.out.print((char) data);
            data = fileReader.read();
        }
        fileReader.close();
    }
}
