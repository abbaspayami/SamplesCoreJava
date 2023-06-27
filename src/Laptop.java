import java.util.Comparator;

public class Laptop implements Comparable<Laptop> {
    public String brand;
    public int ram;
    public Integer price;

    public Laptop(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Laptop laptop) {
        price.compareTo(laptop.price);
        if (this.getRam()> laptop.getRam() && this.getBrand().equals(laptop.getBrand()))
            return 1;
        else
            return -1;
    }
}
