package design.singleton;

public class SingletonExample4 {

    private static volatile SingletonExample4 singletonExample4;

    private SingletonExample4() {};

    public static SingletonExample4 getInstance() {

        if (singletonExample4 == null) {
            synchronized (SingletonExample4.class) {
                if (singletonExample4 == null) {
                    singletonExample4 = new SingletonExample4();
                }
            }
        }

        System.out.println(singletonExample4);
        return singletonExample4;
    }
}
