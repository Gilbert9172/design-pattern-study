package design.singleton;

public class SingletonExample1 {

    private static SingletonExample1 singletonExample1;

    private SingletonExample1() {}

    public static SingletonExample1 getInstance() {
        if (singletonExample1 == null) {
            singletonExample1 = new SingletonExample1();
        }
        System.out.println(singletonExample1);
        return singletonExample1;
    }
}
