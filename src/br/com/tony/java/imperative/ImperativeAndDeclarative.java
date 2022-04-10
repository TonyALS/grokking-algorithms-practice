package br.com.tony.java.imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static br.com.tony.java.imperative.ImperativeAndDeclarative.Gender.FEMALE;
import static br.com.tony.java.imperative.ImperativeAndDeclarative.Gender.MALE;

public class ImperativeAndDeclarative {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );

        //  Imperative approach
        System.out.println("---- IMPERATIVE APPROACH ----");
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }

        //  Declarative approach
        System.out.println("---- DECLARATIVE APPROACH ----");
        Predicate<Person> isFemale = person -> person.gender.equals(FEMALE);
        people.stream()
                .filter(isFemale)
                .forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
