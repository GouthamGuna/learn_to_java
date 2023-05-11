package createzipfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CreateZipFileFromMultipleFilesWithZipOutputStream {

    public void createZipFileFromMultipleFiles() {
        String zipFile = "C:/Users/USER/Desktop/archive.zip";

        String[] srcFiles = {"C:/Users/USER/Desktop/mobileapp/academicyear.php",
                "C:/Users/USER/Desktop/mobileapp/attendance.php", "C:/Users/USER/Desktop/mobileapp/childhistory.php",
                "C:/Users/USER/Desktop/mobileapp/classid.php"};
""
        try {

            // create byte buffer
            byte[] buffer = new byte[1024];

            FileOutputStream fos = new FileOutputStream(zipFile);

            ZipOutputStream zos = new ZipOutputStream(fos);

            for (String file : srcFiles) {

                File srcFile = new File(file);

                FileInputStream fis = new FileInputStream(srcFile);

                // begin writing a new ZIP entry, positions the stream to the start of the entry data
                zos.putNextEntry(new ZipEntry(srcFile.getName()));

                int length;

                while ((length = fis.read(buffer)) > 0) {
                    zos.write(buffer, 0, length);
                }

                zos.closeEntry();

                // close the InputStream
                fis.close();

            }

            // close the ZipOutputStream
            zos.close();

        } catch (IOException ioe) {
            System.out.println("Error creating zip file: " + ioe);
        }
    }
}
