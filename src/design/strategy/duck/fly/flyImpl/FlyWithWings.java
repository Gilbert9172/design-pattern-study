package design.strategy.duck.fly.flyImpl;

import design.strategy.duck.fly.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("훨훨 난다.");
    }
}
