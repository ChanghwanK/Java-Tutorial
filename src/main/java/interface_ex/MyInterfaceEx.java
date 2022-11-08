package interface_ex;

public interface MyInterfaceEx {
    int max_volume = 100;
    static final int MIN_VOLUME = 0;

    static void changeVolume(int num) {
//        max_volume = num;
    }

    default void a() {
        System.out.println("AAAAA");
    }

    void c();

    static void d() {
        System.out.println("CCCCCCCCCC");
    }

    class MyInterfaceImpl implements MyInterfaceEx {

        @Override
        public void c() {
            System.out.println("C는 반드시 구현해야 함...");
        }

        /**
         * 디폴트 메서드도 재정의 할 수 있음
         */
        @Override
        public void a() {
            System.out.println("A가 변경됨");
        }

    }
    public static void main(String[] args) {
        MyInterfaceEx myInterfaceEx = new MyInterfaceImpl();
        MyInterfaceEx.d(); // <= static 멤버는 접근 가능함
//        MyInterfaceEx.a(); // default 메서드는 접근할 수 없음

        // myInterfaceEx.d() Object에서 static을 찌르는 것은 안됨
        // MyInterfaceImpl.d 구현체에서 static 메서드를 호출할 수 없음

    }
}
