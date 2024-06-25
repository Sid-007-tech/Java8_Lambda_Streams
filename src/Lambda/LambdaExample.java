package Lambda;

public class LambdaExample {
    public static void main(String[] args) {
        System.out.println("Starts");


        MyInterImpl mi = new MyInterImpl();
        mi.sayhello();

//  creating lambda expression and use the same method in interface
//        MyInter mi= () -> System.out.println("Hi from lambda");
//
//
//        mi.sayhello();

        MyInter m2 = () -> System.out.println("sayhello from m2");
        m2.sayhello();
//        SumInter se=(a, b)-> {
//          return a + b;
//        };

        MyInter m3 = new MyInter() {
            @Override
            public void sayhello() {
                System.out.println("Hello from m3");
            }
        };
        m3.sayhello();
    }
}
