package design.strategy.duck;

import design.strategy.duck.fly.FlyBehavior;
import design.strategy.duck.quack.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {};

    public abstract void display();

    // 행동 클래스에 위임
    public void performFly() {
        flyBehavior.fly();
    }

    // 행동 클래스에 위임
    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("모든 오리는 뜬다.");
    }
}
