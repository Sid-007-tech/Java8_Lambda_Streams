package Lambda;

import java.util.ArrayList;

public class NewExample {
    public static void main(String[] args) {
        ArrayList<Person> al = new ArrayList<>();
        al.add(new Person(1,"sid"));
        al.add(new Person(2,"am"));
        al.add(new Person(3,"jd"));

        System.out.println("for each loop");
        for (Person p:al) {

            System.out.println(p);
        }

        System.out.println("for i loop");
        for (int i = 0; i < al.size(); i++) {

            System.out.println(al.get(i));
        }

        System.out.println("Using lamda foreach");
        al.forEach(person -> System.out.println(person));
    }
}
