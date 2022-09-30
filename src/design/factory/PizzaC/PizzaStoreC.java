package design.factory.PizzaC;

public abstract class PizzaStoreC {

    protected abstract PizzaC createPizza(String item);

    public PizzaC orderPizza(String type) {
        PizzaC pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}

