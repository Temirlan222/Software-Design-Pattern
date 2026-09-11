package main.java.builder;



public class Main {

    public static void main(String[] args) {

        EmailDirector director = new EmailDirector();
        EmailObjectBuilder objectBuilder = new EmailObjectBuilder();

        director.makeNotificationEmail(objectBuilder);

        Email email  = objectBuilder.getResult();

        System.out.println(email);

        EmailDirector director1 = new EmailDirector();
        EmailTextBuilder objectBuilder1 = new EmailTextBuilder();

        director1.makeWelcomeEmail(objectBuilder1);

        String email1 = objectBuilder1.getResult();

        System.out.println();
        System.out.println(email1);




    }
}
