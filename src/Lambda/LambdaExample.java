package Lambda;

public class LambdaExample {
    public static void main(String[] args) {
        System.out.println("Starts");


    /*  MyInterImpl mi= new MyInterImpl();
    mi.sayhello();*/

//  creating lambda expression and use the same method in interface
        MyInter mi= () -> System.out.println("Hi from lambda");

        mi.sayhello();

//        SumInter se=(a, b)-> {
//          return a + b;
//        };
        SumInter se=(a, b) ->  a + b;


        System.out.println("Summation of two values :"+ se.sum(7,8));
    }
}
