package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWithh {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,222,344,245,67,87,256);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(222);
        list1.add(223);
        System.out.println(list1);


        List<Integer> numberWith2=
                                list.stream()
                                    .map(String::valueOf)
                                        .filter(e->e.startsWith("2"))
                                            .map(Integer::valueOf)
                                                .collect(Collectors.toList());
        System.out.println(numberWith2);

        List<String> list2= Arrays.asList("ADS","KKB","NKIC","lkjhpD");
         long count = list2.stream()
                .count();
        System.out.println(count);
    }
}
