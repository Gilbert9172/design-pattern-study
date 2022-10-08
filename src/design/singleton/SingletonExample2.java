package design.singleton;

public class SingletonExample2 {

    private static SingletonExample2 singletonExample2;

    private SingletonExample2() {};

    public static synchronized SingletonExample2 getInstance() {
        if (singletonExample2 == null) {
            singletonExample2 = new SingletonExample2();
        }
        System.out.println(singletonExample2);
        return singletonExample2;
    }
}
