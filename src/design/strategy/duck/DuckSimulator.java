package design.strategy.duck;

public class DuckSimulator {

    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.swim();

    }

}
