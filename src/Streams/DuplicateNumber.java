package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateNumber {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,4,3,2,1,6,7,8,9,8,7);

        //method 1
        Set<Integer> dupList = list.stream()
                .filter(e-> Collections.frequency(list,e)>1)
                .collect(Collectors.toSet());
        System.out.println(dupList);

        //method 2
        Set<Integer> list2 = new HashSet<>();

        Set<Integer> dupl=list.stream()
                .filter(e -> !list2.add(e))
                .collect(Collectors.toSet());
        System.out.println(dupl);

    }
}
