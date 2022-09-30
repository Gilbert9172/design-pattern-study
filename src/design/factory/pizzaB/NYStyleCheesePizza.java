package design.factory.pizzaB;

import design.factory.pizzaB.PizzaB;

public class NYStyleCheesePizza extends PizzaB {

    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}

