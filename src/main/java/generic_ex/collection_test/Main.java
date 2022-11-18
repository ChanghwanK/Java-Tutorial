package generic_ex.collection_test;

import java.util.Collection;
class Parent {

}

class Child extends Parent {}

public class Main {
    public void printCollection(Collection<? extends MyParent> collection) {
        /**
         * extends를 상한선을 두는 것
         * MyParent를 상속하는 친구가 여러개가 될 수 있기 때문에 MyChild라는 것을 보장하지 못함
         * 따라서 MyChild로 꺼내는 것은 불가능
         */
//        for(MyChild e : collections) {
//
//        }

        for(MyParent p : collection) {

        }

        for(MyGrandParent gp : collection) {

        }
    }

    public void addCollection(Collection<? extends MyParent> collection) {
        /**
         * 모두 컴파일 에러
         * 이유
         * - collection이 MyParent 하위 타입 모두이기 때문에 어떤 타입인지 알 수 없음
         * - 즉, Collection에 MyChild 또는 AnotherChild 가 올 수 있는 상태
         * - 이 경우 하한 경계를 설정해서 해결할 수 있음
         */
//        collection.add(new MyChild());
//        collection.add(new MyParent());
//        collection.add(new MyGrandParent());
//        collection.add(new Object());
    }

    /**
     * MyParent를 상속받는 친구들을 Collection에 추가하고 싶다면 super를 사용해야함
     */
    public void addCollectionWithSuper(Collection<? super MyParent> collection) {
        collection.add(new MyChild());
        collection.add(new MyParent());
//        collection.add(new MyGrandParent()); // 컴파일 에러
    }

    public static void main(String[] args) {
        Parent parent = new Child(); // 업 캐스팅
//        Child child = new Parent();  // 상위 클래스 타입은 하위 클래스에 초기화할 수 없음 // 컴파일 에러
    }

}
