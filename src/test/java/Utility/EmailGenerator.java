package Utility;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class EmailGenerator {

    /***
     * This method is to recipient file reader to get data from notepad
     *
     * @author Amila_Wijerathna
     */
    public void recipientFileReader() {
        String recipientFilePath = "src/resources/testData/recipients.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(recipientFilePath))) {
            String line;
            // Read each line from the file
            while ((line = br.readLine()) != null) {
                // Split the line into an array of values using a delimiter (e.g., comma)
                String[] values = line.split(",");
                // Process each value or store it as needed
                for (String value : values) {
                    String recipient = value.trim();
                    String subject = "Test Automation Report - Initial Testing Emails";
                    String body = "Hi All ! This is the Automation Result - Email Generator Initial Testing. Your testing is complete. Here is the summary report.";
                    String reportFilePath = "target/Spark.html";
                    // email generate class call
                    sendEmailWithReport(recipient, subject, body, reportFilePath);
                }
                // Move to the next line in the console
                System.out.println("All recipient read successfully");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /***
     * This method is to send email to red users
     *
     * @author Amila_Wijerathna
     */
    public void sendEmailWithReport(String recipient, String subject, String body, String reportFilePath) {
        // Set email properties and add smtp port of you local
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        // Set sender's email credentials
        String senderEmail = "irunika.app.test@gmail.com";
        String senderPassword = "adjcainhcgndiujl";

        // Create a session
        Session session = Session.getInstance(properties,
                new javax.mail.Authenticator() {
                    protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                        return new javax.mail.PasswordAuthentication(senderEmail, senderPassword);
                    }
                });

        try {
            // Create a message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
            message.setSubject(subject);
            message.setText(" Hi All ! This is the Automation Result - Email Generator Initial Testing");

            // Create the email body
            Multipart multipart = new MimeMultipart();
            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText(body);
            multipart.addBodyPart(messageBodyPart);

            // Attach the report file
            messageBodyPart = new MimeBodyPart();
            DataSource source = new FileDataSource(reportFilePath);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName("TestReport.html");
            multipart.addBodyPart(messageBodyPart);

            message.setContent(multipart);

            // Send the message
            Transport.send(message);

            System.out.println("Email with report sent successfully.");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
