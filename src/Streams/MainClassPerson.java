package Streams;

import OOPsPractice.C;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class MainClassPerson {


    public static void main(String[] args) {
        int[] arr = {12,9,14,7};
        Person[] people = new Person[4];
        people[0] = new Person(12,"Sid");
        people[1] = new Person(9,"Pid");
        people[2] = new Person(14,"Aid");
        people[3] = new Person(7,"Mid");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(people, Person.newAgeComparator);
        System.out.println(Arrays.toString(people));

        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(new Person(12,"Sid"));
        arrayList.add(new Person(9,"Pid"));
        arrayList.add(new Person(14,"Aid"));
        arrayList.add(new Person(7,"Mid"));

        Collections.sort(arrayList);
        System.out.println("Arraylist Sorting"+arrayList);
        Collections.sort(arrayList,Person.newAgeComparator);
        System.out.println("Arraylist sortin with name"+arrayList);

        Collections.sort(arrayList, Comparator.comparing(Person::getPname)
                .thenComparing(Person::getPid));
        System.out.println("Comparing STreams"+arrayList);

    }

}
