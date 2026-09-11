package main.java.builder;

public class EmailTextBuilder extends AbstractEmailBuilder {

    public String getResult(){
        validate();

        return "From: " + from + "\nTo: " + to + "\nSubject: " + subject + "\nBody: " + body;
    }

}
