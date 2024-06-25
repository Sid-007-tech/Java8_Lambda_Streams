package Streams;

import java.util.Comparator;

public class Person implements Comparable<Person>{
    int pid;
    String pname;

    public Person(int pid, String pname) {
        this.pid = pid;
        this.pname = pname;
    }


    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.pid-o.pid;
    }

    public static Comparator<Person> newAgeComparator = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getPname().compareTo(o2.getPname());
        }
    };
}
