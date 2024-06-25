package OOPsPractice;

public class TestSingleTon {
    public static void main(String[] args) {
        SingletonClassExample a = SingletonClassExample.getInstance();

        a.str= (a.str).toUpperCase();
        System.out.println(a.str);
    }
    }

