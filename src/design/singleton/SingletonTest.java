package design.singleton;

public class SingletonTest {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
//                SingletonExample1.getInstance();
//                SingletonExample2.getInstance();
//                SingletonExample3.getInstance();
//                SingletonExample4.getInstance();
                SingletonExample5.getInstance();
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
//                SingletonExample1.getInstance();
//                SingletonExample2.getInstance();
//                SingletonExample3.getInstance();
//                SingletonExample4.getInstance();
                SingletonExample5.getInstance();
            }
        });
        thread2.start();
    }
}
