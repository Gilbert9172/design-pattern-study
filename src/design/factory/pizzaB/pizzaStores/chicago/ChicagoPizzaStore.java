package design.factory.pizzaB.pizzaStores.chicago;

import design.factory.pizzaB.PizzaB;
import design.factory.pizzaB.PizzaStoreB;

public class ChicagoPizzaStore extends PizzaStoreB {

    public ChicagoPizzaStore() {};

    @Override
    public PizzaB orderPizza(String type) {
        return super.orderPizza(type);
    }

    public PizzaB createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}

