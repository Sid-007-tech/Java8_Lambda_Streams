package FunctionalInterface;

@FunctionalInterface
public interface ExampleInterface {
    int randomCalc(int a, int b);

    default void Print(int result){
        System.out.println("Result :"+result);
    }


}
