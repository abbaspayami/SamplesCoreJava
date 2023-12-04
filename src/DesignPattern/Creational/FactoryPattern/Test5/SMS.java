package DesignPattern.Creational.FactoryPattern.Test5;

public class SMS implements Message {

    private String phoneNumber;
    private String content;

    public SMS(String phoneNumber, String content) {
        this.phoneNumber = phoneNumber;
        this.content = content;
    }

    @Override
    public void send() {
        System.out.println("Sending email to " +  phoneNumber + ": " + content);
    }
}
