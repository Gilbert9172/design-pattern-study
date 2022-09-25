package design.factory.pizzaA;

import java.util.ArrayList;
import java.util.List;

abstract public class Pizza {

    public String name;
    public String dough;
    public String sauce;
    public List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing " + this.name);
    }

    public void bake() {
        System.out.println("Baking = " + this.name);
    }

    public void cut() {
        System.out.println("Cutting " + this.name);
    }

    public void box() {
        System.out.println("Boxing " + this.name);
    }

    public String toString() {
        // code to display pizza name and ingredients
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }
}
