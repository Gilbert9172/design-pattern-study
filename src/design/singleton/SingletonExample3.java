package design.singleton;

public class SingletonExample3 {

    private static SingletonExample3 singletonExample3 = new SingletonExample3();

    private SingletonExample3() {};

    public static SingletonExample3 getInstance() {
        System.out.println(singletonExample3);
        return singletonExample3;
    }
}
