package DesignPattern.Behavioral.CommandPattern;

public class Drink {
    private String name;
    private int price;
    private int liter;

    public Drink(String name, int price, int liter) {
        this.name = name;
        this.price = price;
        this.liter = liter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getLiter() {
        return liter;
    }

    public void setLiter(int liter) {
        this.liter = liter;
    }
}
