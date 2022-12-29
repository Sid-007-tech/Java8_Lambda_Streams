package Streams;

import Lambda.Person;

import java.util.ArrayList;

public class StreamExample {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person(1,"sid"));
        people.add(new Person(2,"am"));
        people.add(new Person(3,"jd"));
        people.add(new Person(3,"Akshay"));

        people.stream()
                .filter(person -> person.getPname().startsWith("a") )
                .forEach(person -> System.out.println(person.getPname()));


    }
}
