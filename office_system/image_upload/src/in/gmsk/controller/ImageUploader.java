package in.gmsk.controller;

import in.gmsk.exception.DataTruncationException;
import in.gmsk.model.JDBCConnection;
import in.gmsk.util.GenerateUserName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.*;


public class ImageUploader {
    private static Logger logger = LoggerFactory.getLogger(ImageUploader.class);

    public String uploadImage(String imgPath) {
        logger.info("STARTING...");
        Connection conn = JDBCConnection.getSeparateConnection();
        PreparedStatement stmt = null; FileInputStream fis = null;
        int count = 0;
        String status = "Failed try again...";
        try {
            File file = new File(imgPath);
            fis = new FileInputStream(file);

            stmt = conn.prepareStatement("INSERT INTO `image_upload` (`name`, `image`) VALUES(?,?);");
            stmt.setString(1, GenerateUserName.getName());
            stmt.setBinaryStream(2, fis, (int) file.length());
            count = stmt.executeUpdate();

            if(stmt.getWarnings() instanceof DataTruncation){
                DataTruncation dt = (DataTruncation) stmt.getWarnings();
                throw new DataTruncationException(dt.getMessage());
            }

            if (count > 0) {
                status = "Image uploaded successfully.";
            }

        } catch (Exception e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (null != stmt && !stmt.isClosed()) {
                    stmt.close();
                }
                if (null != fis) {
                    fis.close();
                }
                if (null != conn && !conn.isClosed()) {
                    conn.close();
                }
            } catch (Exception e) {
                logger.error(e.getMessage());
                e.printStackTrace();
            }
        }
        logger.info("ENDED.");
        return status;
    }

    public String downloadImage(String downloadImgPath) {
        logger.info("STARTING...");
        Connection conn = JDBCConnection.getSeparateConnection();
        PreparedStatement stmt = null; ResultSet rs = null; FileOutputStream fos = null;
        String status = "Download Failed try again...";
        try {

            File file = new File(downloadImgPath);
            fos = new FileOutputStream(file);
            byte b[]; Blob blob;

            stmt = conn.prepareStatement("SELECT `image` FROM `image_upload` WHERE `id`='1';");
            rs = stmt.executeQuery();

            while (rs.next()) {
                status = "Image download successfully.";
                blob = rs.getBlob("image");
                b = blob.getBytes(1, (int) blob.length());
                fos.write(b);
            }

        } catch (Exception e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        }finally {
            try {
                if (null != stmt && !stmt.isClosed()) {
                    stmt.close();
                }
                if (null != fos) {
                    fos.close();
                }
                if (null != conn && !conn.isClosed()) {
                    conn.close();
                }
            } catch (Exception e) {
                logger.error(e.getMessage());
                e.printStackTrace();
            }
        }
        logger.info("ENDED.");
        return status;
    }

    public String uploadImageLongBlob(String imgPath) {
        logger.info("STARTING...");
        Connection conn = JDBCConnection.getSeparateConnection();
        PreparedStatement stmt = null; FileInputStream fis = null;
        int count = 0;
        String status = "Failed try again...";
        try {
            File file = new File(imgPath);
            fis = new FileInputStream(file);

            stmt = conn.prepareStatement("INSERT INTO `image_upload` (`name`, `image`) VALUES(?,?);");
            stmt.setString(1, GenerateUserName.getName());
            stmt.setBinaryStream(2, fis, (int) file.length());
            count = stmt.executeUpdate();

            if(stmt.getWarnings() instanceof DataTruncation){
                DataTruncation dt = (DataTruncation) stmt.getWarnings();
                throw new DataTruncationException(dt.getMessage());
            }

            if (count > 0) {
                status = "Image uploaded successfully.";
            }

        } catch (Exception e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (null != stmt && !stmt.isClosed()) {
                    stmt.close();
                }
                if (null != fis) {
                    fis.close();
                }
                if (null != conn && !conn.isClosed()) {
                    conn.close();
                }
            } catch (Exception e) {
                logger.error(e.getMessage());
                e.printStackTrace();
            }
        }
        logger.info("ENDED.");
        return status;
    }
}
