package lambda_ex.function_and_compose_Ex;

import java.lang.reflect.Member;
import java.util.function.Function;

class Address {
    String address;

    public Address(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class Person {
    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }
}

public class Main {
    public static void main(String[] args) {
        Function<Person, Address> function1;
        Function<Address, String> function2;
        Function<Person, String> functionAB;

        function1 = new Function<Person, Address>() {
            @Override
            public Address apply(Person person) {
                return person.getAddress();
            }
        };

        function1 = Person::getAddress;
        function2 = Address::getAddress;
        functionAB = function1.andThen(function2);

        String a = functionAB.apply(new Person("David", new Address("서울")));
        System.out.println(a);
        // >>> 서울
    }
}
