package design.observer;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    // CondimentDecorator의 추상메서드 구현
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

    // Beverage의 추상메서드 구현
    public double cost() {
        return beverage.cost() + .02;
    }

}
