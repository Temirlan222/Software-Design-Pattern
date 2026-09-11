package main.java.builder;

public class EmailObjectBuilder extends AbstractEmailBuilder {
    public Email getResult(){
        validate();

        return new Email(from,to,subject,body);

    }


}

