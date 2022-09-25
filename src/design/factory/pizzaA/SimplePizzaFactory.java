package design.factory.pizzaA;

import design.factory.pizzaA.pizzaMenu.CheesePizza;
import design.factory.pizzaA.pizzaMenu.ClamPizza;
import design.factory.pizzaA.pizzaMenu.PepperoniPizza;
import design.factory.pizzaA.pizzaMenu.VeggiePizza;

public class SimplePizzaFactory {

    public SimplePizzaFactory() {};

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
