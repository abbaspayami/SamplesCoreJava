package DesignPattern.Creational.BuilderPattern;

public class MainBuilder {
    public static void main(String[] args) {
        Product product = new Product
                .Builder()
                .setProperty2("Abbas", "Payami")
                .build();
        System.out.println(product.getProperty1() + ":" + product.getProperty2() + ":" + product.getProperty3());
    }
}
