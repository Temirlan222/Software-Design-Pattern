package main.java.builder;

public class EmailDirector {


    public void makeWelcomeEmail(EmailBuilder builder){
        builder
                .setBody("Hello. How r u, wyd?")
                .setFrom("Temirlan")
                .setTo("Friend")
                .setSubject("Welcome");

    }
    public void makeNotificationEmail(EmailBuilder builder){
        builder
                .setBody("You have new not")
                .setFrom("Temirlan")
                .setTo("Friend")
                .setSubject("Telegram notification");

    }
}
