package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0,2,44,5,6,8,9,8,7,6,4,2);

        List<Integer> evenList= list.stream()
                .filter(e->e%2==0)
                .collect(Collectors.toList());
        System.out.println(evenList);
    }
}
