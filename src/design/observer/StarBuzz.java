package design.observer;

public class StarBuzz {

    public static void main(String[] args) {

        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
        System.out.println("=====*=====*=====*=====");

        Beverage beverage2 = new Mocha(beverage1);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
        System.out.println("=====*=====*=====*=====");

        Beverage beverage3 = new Mocha(beverage2);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
        System.out.println("=====*=====*=====*=====");

    }

}
