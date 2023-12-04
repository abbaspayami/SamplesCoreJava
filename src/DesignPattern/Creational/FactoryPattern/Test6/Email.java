package DesignPattern.Creational.FactoryPattern.Test6;

public class Email implements Message{

    private String recipient;
    private String content;

    public Email(String recipient, String content) {
        this.recipient = recipient;
        this.content = content;
    }

    @Override
    public void send() {
        System.out.println("Sending email to " +  recipient + ": " + content);
    }
}
