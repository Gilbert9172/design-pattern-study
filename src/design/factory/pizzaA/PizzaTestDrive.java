package design.factory.pizzaA;

import design.factory.pizzaA.Pizza;
import design.factory.pizzaA.PizzaStore;
import design.factory.pizzaA.SimplePizzaFactory;

public class PizzaTestDrive {

    public static void main(String[] args) {

        PizzaStore store = new PizzaStore(new SimplePizzaFactory());

        Pizza pizza = store.orderPizza("cheese");

        System.out.println(pizza.toString());

    }

}
