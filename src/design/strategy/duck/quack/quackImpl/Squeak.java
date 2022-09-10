package design.strategy.duck.quack.quackImpl;

import design.strategy.duck.quack.QuackBehavior;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("삑");
    }
}
