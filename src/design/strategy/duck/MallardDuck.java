package design.strategy.duck;

import design.strategy.duck.fly.flyImpl.FlyWithWings;
import design.strategy.duck.quack.quackImpl.Squeak;

public class MallardDuck extends Duck {

    public MallardDuck() {

        quackBehavior = new Squeak();
        flyBehavior = new FlyWithWings();

    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
