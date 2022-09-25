package design.factory.pizzaB.pizzaStores.chicago;

import design.factory.pizzaB.PizzaB;

public class ChicagoStyleCheesePizza extends PizzaB {

    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}