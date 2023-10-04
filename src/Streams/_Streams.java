package Streams;


import java.util.List;
import java.util.stream.Collectors;

import static Streams._Streams.Gender.*;


public class _Streams {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Hamid", MALE),
                new Person("Karima", FEMALE),
                new Person("Maria", FEMALE),
                new Person("Ahmed", MALE)
        );


        //get Males
        //people.stream()
        //        .filter(person -> person.gender == MALE)
        //        .forEach(System.out::println);
        //get Females names
        //people.stream()
        //        .filter(person -> person.gender == FEMALE)
        //        .map(person -> person.name)
        //        .forEach(System.out::println);
        boolean match;
        match = people.stream()
                .allMatch(person -> FEMALE.equals(person.gender));
        System.out.println(match);
        match = people.stream()
                .anyMatch(person -> MALE.equals(person.gender));
        System.out.println(match);
        match = people.stream()
                .noneMatch(person -> ANY_OTHER_LGBTQ_PLUS_MAX_S_PRO_SHIT.equals(person.gender));
        System.out.println(match);
    }


    static class Person {
        private final String name;
        private final Gender gender;
        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender{
        MALE,
        FEMALE,
        ANY_OTHER_LGBTQ_PLUS_MAX_S_PRO_SHIT
    }
}
