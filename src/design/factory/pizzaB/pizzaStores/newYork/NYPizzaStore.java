package design.factory.pizzaB.pizzaStores.newYork;

import design.factory.pizzaB.PizzaB;
import design.factory.pizzaB.PizzaStoreB;

public class NYPizzaStore extends PizzaStoreB {

    public NYPizzaStore() {};

    @Override
    public PizzaB orderPizza(String type) {
        return super.orderPizza(type);
    }

    public PizzaB createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}