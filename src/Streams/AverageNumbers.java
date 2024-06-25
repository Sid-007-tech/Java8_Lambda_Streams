package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageNumbers {
    public static void main(String[] args) {
        List<Integer> list2 = Arrays.asList(1,4,5,6,22,3,90,89,2,1,3,4,55,6);
        OptionalDouble sum1 = list2.stream().mapToInt(e->e).average();

        System.out.println("Sum of numbers2 "+ sum1);
    }
}
