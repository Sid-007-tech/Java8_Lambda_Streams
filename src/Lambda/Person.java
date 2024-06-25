package Lambda;

import java.util.Objects;

public class Person {
    int pid;
    String pname;

    public Person(int pid, String pname) {
        this.pid = pid;
        this.pname = pname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return pid == person.pid && Objects.equals(pname, person.pname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pid, pname);
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
}
