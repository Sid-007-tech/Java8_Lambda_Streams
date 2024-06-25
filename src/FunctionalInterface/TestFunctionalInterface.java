package FunctionalInterface;

public class TestFunctionalInterface {
    public static void main(String[] args) {
        ExampleInterface exampleInterface = (a,b) -> {
            int sum=a+b;
            return sum;
        };

        exampleInterface.Print(exampleInterface.randomCalc(2,3));
    }
}
