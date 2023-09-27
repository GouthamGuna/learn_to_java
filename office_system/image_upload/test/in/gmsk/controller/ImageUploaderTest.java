package in.gmsk.controller;

import org.junit.jupiter.api.Test;

class ImageUploaderTest {
    private ImageUploader uploader = new ImageUploader();

    @Test
    void uploadImageTest() {
        String imagePath, output;

        imagePath = "C:\\Users\\User\\Downloads\\davy-jones-pirates-of-the-caribbean.jpg";
        output = uploader.uploadImage(imagePath);

        System.out.println("output = " + output);
    }

    @Test
    void uploadImageLongBlobTest() {
        String imagePath, output;

        imagePath = "C:\\Users\\User\\Downloads\\Suresh Photo.jpeg";
        output = uploader.uploadImage(imagePath);

        System.out.println("output = " + output);
    }

    @Test
    void downloadImageTest() {
        String downloadPath, output;

        downloadPath = "C:\\Users\\User\\Downloads\\Output_Stream_Img.jpg";
        output = uploader.downloadImage(downloadPath);

        System.out.println("output = " + output);
    }
}