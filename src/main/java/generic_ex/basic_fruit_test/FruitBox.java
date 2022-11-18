package generic_ex.basic_fruit_test;

import java.util.ArrayList;

public class FruitBox<T extends Fruit> {
    ArrayList<T> box = new ArrayList<>();
    public void addFruit(T fruit) {
        box.add(fruit);
    }
}
