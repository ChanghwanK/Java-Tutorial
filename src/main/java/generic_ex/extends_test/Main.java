package generic_ex.extends_test;

import java.util.Collection;

class GrandParent {}
class Parent extends GrandParent{}
class Child extends Parent{}


public class Main {

    public void add(Collection<? extends GrandParent> c) {
        /**
         * GrandParent를 상속하는 하위 타입이 모두 올 수 있기 때문에
         * 타입 캐스팅에 문제가 생김
         */
//        c.add(new GrandParent());
//        c.add(new Child())
    }

    public static void main(String[] args) {

    }
}
