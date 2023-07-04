package DesignPattern.CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<OrderCommand> orderCommands = new ArrayList<>();

    public void placeOrder(OrderCommand orderCommand) {
        orderCommands.add(orderCommand);
        System.out.println(orderCommand.getName() + "is Ordered");
    }

    public int calculate() {
        return orderCommands.stream()
                .map(OrderCommand::calcPrice).
                reduce(Integer::sum).
                orElse(0);
    }
}
