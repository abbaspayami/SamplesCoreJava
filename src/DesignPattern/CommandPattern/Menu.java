package DesignPattern.CommandPattern;

public enum Menu {
    FrenchFries(new DishOrder(new Dish("French Fries", 1200, "Potato,Red Sauce"))),
    Peperoni(new DishOrder(new Dish("Peperoni Pizza", 2500, "Peperoni, Cheddar cheese, Tomato"))),
    CaramelCream(new DishOrder(new Dish("Caramel Cream", 700, "Caramel Powder, Milk"))),
    BigMagSandwich(new SandwichOrder(new Sandwich("BigMag",2500,2)));

    private OrderCommand order;

    Menu(OrderCommand order) {
        this.order = order;
    }

    public OrderCommand getOrder() {
        return order;
    }
}
