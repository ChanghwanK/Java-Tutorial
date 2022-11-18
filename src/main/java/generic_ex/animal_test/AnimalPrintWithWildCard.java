package generic_ex.animal_test;

public class AnimalPrintWithWildCard {

    /**
     * 안되는 이유가 뭐냐
     *
     * wild 카드의 경우 부모 타입 하위의 모든 클래스가 올 수 있단 것을 의미함
     * 즉, Dog, Cat, Bird 같은 것들이 올 수 있음 이 친구들은 계층 관계가 아니라 관념적으로 하위 타입인 것이 보장됨
     * 하지만 컴퓨터 입장에선 Dog를 상속받는 무언가 없다는 보장을 하지 못함
     * 따라서 캐스팅 문제가 생김
     *
     * 업 캐스팅
     * - 자식이 부모 타입으로는 캐스팅 되지만 부모 타입이 자식 타입으로는 캐스팅 하지 못하는 것을 의미
     */
    public void dogPrinter(AnimalPrinter<? extends Animal> printer) {
//        printer.printAnimalName(new Dog("Happy")); // 컴파일 에러
    }

}
