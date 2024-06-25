package Streams;

import java.util.Arrays;
import java.util.List;

public class NumberSquareAverage {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,10,20,30,15);

         double asDouble = list.stream()
                .map(e -> e * e)
                .mapToInt(e -> e)
                .filter(e -> e > 100)
                .average()
                .getAsDouble();
        System.out.println(asDouble);

    }
}
