package design.singleton;

public class SingletonExample5 {

    private SingletonExample5() {};

    private static class InnerInstanceClass {

        static {
            System.out.println("내부 클래스 호출시 초기화 진행");
        }

        private static final SingletonExample5 singletonExample5 = new SingletonExample5();
    }

    public static SingletonExample5 getInstance() {
        SingletonExample5 singletonExample = InnerInstanceClass.singletonExample5;
        System.out.println(singletonExample);
        return singletonExample;
    }
}
