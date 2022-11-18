package generic_ex.basic_fruit_test;

public class Main {

    public static void main(String[] args) {
        FruitBox<Apple> box = new FruitBox<>(); // 사과 박스
        box.addFruit(new Apple("사과"));
    }
}
