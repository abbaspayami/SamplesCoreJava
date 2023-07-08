package DesignPattern.CommandPattern;

import java.util.Map;

public interface OrderFactory {

    OrderCommand createOrder(String typeOrder, String nameOrder);

}
