package main.java.builder;

public abstract class AbstractEmailBuilder implements EmailBuilder{
    protected String from;
    protected String to;
    protected String subject;
    protected String body;

    @Override

    public EmailBuilder setFrom(String from){
        this.from = from;
        return this;
    }
    public EmailBuilder setTo(String to){
        this.to = to;
        return this;
    }
    public EmailBuilder setBody(String body){
        this.body = body;
        return this;
    }
    public EmailBuilder setSubject(String subject){
        this.subject = subject;
        return this;
    }

    protected void validate(){
        if (from == null || to == null){
            throw new IllegalStateException("from and to are required");

        }
    }


}
