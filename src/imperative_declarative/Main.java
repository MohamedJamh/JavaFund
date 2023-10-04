package imperative_declarative;

import java.util.ArrayList;
import java.util.List;

import static imperative_declarative.Main.Gender.FEMALE;
import static imperative_declarative.Main.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        //Imperative
        System.out.println("//Imperative");
        List<Person> people = List.of(
            new Person("Hamid", MALE),
            new Person("Karima", FEMALE),
            new Person("Maria", FEMALE),
            new Person("Ahmed", MALE)
        );

        List<Person> females = new ArrayList<>();
        for(Person person: people){
            if(person.getGender().equals(FEMALE)){
                females.add(person);
            }
        }
        for(Person female: females){
            System.out.println(female);
        }
        //Declarative
        System.out.println("//Declarative");
        people.stream().filter(person -> FEMALE.equals(person.gender))
                .forEach(System.out::println);

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
        FEMALE
    }
}
