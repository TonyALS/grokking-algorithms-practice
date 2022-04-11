package br.com.tony.java.streams;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static br.com.tony.java.streams.Gender.FEMALE;
import static br.com.tony.java.streams.Gender.MALE;

public class _StreamFeatures {

    public static void main(String[] args) {
        List<Person> peoples = getPeople();

        //  Declarative approach - Filter
        System.out.println("--- Declarative Approach - FILTER ----");
        Predicate<Person> isFemale = person -> person.getGender().equals(FEMALE);
        peoples.stream()
                .filter(isFemale)
                .forEach(System.out::println);

        //  Declarative approach - Sort
        System.out.println("--- Declarative Approach - Sort(by age) ----");
        peoples.stream()
                .sorted(Comparator.comparingInt(Person::getAge).reversed())
                .forEach(System.out::println);

        //  Declarative approach - All Match
        System.out.println("--- Declarative Approach - All Match(with female gender) ----");
        boolean allMatch = peoples.stream()
                .allMatch(person -> person.getGender().equals(FEMALE));
        System.out.println(allMatch);

        //  Declarative approach - Any Match
        System.out.println("--- Declarative Approach - Any Match(with female gender) ----");
        boolean anyMatch = peoples.stream()
                .anyMatch(person -> person.getGender().equals(FEMALE));
        System.out.println(anyMatch);

        //  Declarative approach - Max
        System.out.println("--- Declarative Approach - Max(age) ----");
        peoples.stream()
                .max(Comparator.comparingInt(Person::getAge))
                .ifPresent(System.out::println);

        //  Declarative approach - Min
        System.out.println("--- Declarative Approach - Min(age) ----");
        peoples.stream()
                .min(Comparator.comparingInt(Person::getAge))
                .ifPresent(System.out::println);

        //  Declarative approach - Group
        System.out.println("--- Declarative Approach - Group(by gender) ----");
        BiConsumer<Gender, List<Person>> biConsumer =
                (gender, list) -> System.out.println(gender + " -- " + list);
        peoples.stream()
                .collect(Collectors.groupingBy(Person::getGender))
                .forEach(biConsumer);

        //  Declarative approach - SET
        System.out.println("--- Declarative Approach - SET(by gender) ----");
        peoples.stream()
                .map(Person::getGender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("James Bond", 20, MALE),
                new Person("Alina Smith", 33, FEMALE),
                new Person("Helen White", 57, FEMALE),
                new Person("Alex Boz", 14, MALE),
                new Person("Jamie Goa", 99, MALE),
                new Person("Anna Cook", 7, FEMALE),
                new Person("Zelda Brown", 120, FEMALE)
        );
    }
}
