package generic_ex.animal_test;

/**
 * 상한 선을
 * - Animal로 정함
 */
public class AnimalPrinter <T extends Animal> {
    public void printAnimalName(T animal) {
        System.out.println("Name: " + animal.getName());
    }
}
