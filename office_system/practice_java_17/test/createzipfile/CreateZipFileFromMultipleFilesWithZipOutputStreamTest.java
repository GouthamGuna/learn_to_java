package createzipfile;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateZipFileFromMultipleFilesWithZipOutputStreamTest {

    @Test
    void createZipFileFromMultipleFiles() {
        CreateZipFileFromMultipleFilesWithZipOutputStream file =
                new CreateZipFileFromMultipleFilesWithZipOutputStream();

        file.createZipFileFromMultipleFiles();

    }
}