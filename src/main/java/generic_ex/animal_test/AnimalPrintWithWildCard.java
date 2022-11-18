package generic_ex.animal_test;

public class AnimalPrintWithWildCard {

    public void dogPrinter(AnimalPrinter<? extends Animal> printer) {
//        printer.printAnimalName(new Animal("Happy"));
    }

}
