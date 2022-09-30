package design.factory.pizzaB;

import design.factory.pizzaB.PizzaB;

public class NYStyleClamPizza extends PizzaB {

    public NYStyleClamPizza() {
        name = "NY Style Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Fresh Clams from Long Island Sound");
    }
}