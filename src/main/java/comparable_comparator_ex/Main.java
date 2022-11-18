package comparable_comparator_ex;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    static class Person {
        int age;

        public Person(int age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        var persons = Arrays.asList(new Person(10), new Person(32), new Person(23));

        Collections.sort(persons, (p1, p2) ->
             p1.age - p2.age
        );

        for(Person person : persons) {
            System.out.println(person.age);
        }
    }

}
