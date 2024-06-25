package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,5,6,22,3,90,89,2,1,3,4,55,6);
         Optional<Integer> sum = list.stream().reduce(Integer::sum);

        System.out.println("Sum of numbers "+ sum);


    }



}
