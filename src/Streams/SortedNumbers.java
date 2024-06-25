package Streams;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortedNumbers {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(8,7,7,68,4,5,75,3,1);

        List<Integer> sortedList=
        list.stream()
                .sorted().collect(Collectors.toList());

        System.out.println(sortedList);

        //please sort as descending order
        List<Integer> reverseOrderSortedList=
        list.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(reverseOrderSortedList);
    }
}
