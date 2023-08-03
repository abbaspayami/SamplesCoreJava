package DesignPattern.Behavioral.CommandPattern;

public interface OrderFactory {

    OrderCommand createOrder(String typeOrder, String nameOrder);

}
