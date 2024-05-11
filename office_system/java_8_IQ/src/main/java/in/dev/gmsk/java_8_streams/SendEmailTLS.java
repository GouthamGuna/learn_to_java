package in.dev.gmsk.java_8_streams;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendEmailTLS {

    public static void main(String[] args) {

        final String username = "<From-MailID>";
        final String password = "<API-KEY>";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("<Int-MailID>"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse("user1@gmail.com, user2@gmail.com")
            );
            message.setRecipients(Message.RecipientType.BCC, InternetAddress.parse("BCCuser1@gmail.com"));
            message.setSubject("Testing Gmail TLS");
            message.setText("Dear user,"
                    + "\n\n Please do not spam my email!");

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
