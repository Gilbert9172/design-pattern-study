package design.factory.pizzaB;

public abstract class PizzaStoreB {

    protected abstract PizzaB createPizza(String item);

    public PizzaB orderPizza(String type) {
        PizzaB pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
