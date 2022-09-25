package design.factory.pizzaA;

public class PizzaTestDrive {

    public static void main(String[] args) {

        PizzaStore store = new PizzaStore(new SimplePizzaFactory());

        Pizza pizza = store.orderPizza("cheese");

        System.out.println(pizza.toString());

    }

}
