package Lambda;

public class CalculatorMain {

    public static void main(String[] args) {
        Calculator c1= new CalculatorImpl() {
            @Override
            public void calculation() {

            }

            @Override
            public void AnotherCalc() {

            }
        };

       // Calculator c2= () -> {};
    }
}
