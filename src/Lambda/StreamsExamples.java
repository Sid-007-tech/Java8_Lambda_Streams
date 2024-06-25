package Lambda;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsExamples {
    public static void main(String[] args) {

/*        List<String> strings= Arrays.asList("sourabhKothari","pranet","pranet","siddh","orange","apple","siddh");
        Set<String> uniqnames = new HashSet<>();
        List<String> duplicateName=strings.stream()
                .filter(name->!uniqnames.add(name)).collect(Collectors.toList());

        System.out.println(duplicateName);
        System.out.println(uniqnames);*/

        Map<String, String> hMap
                = new HashMap<String, String>();

        // add elements into the Map
        hMap.put("1", "Welcome");
        hMap.put("2", "To");
        hMap.put("3", "Geeks");
        hMap.put("4", "For");
        hMap.put("5", "Geeks");

        Map<String, String> sMap= Collections.synchronizedMap(hMap);
        System.out.println("Synchronized Map :"+sMap);

/*        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        List<Integer> list = myList.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(list);*/
/*        List<Integer> list = Arrays.asList(23,43,45,65,12,14,11,89,12);

        list.stream()
                .map(s->s+"")
                .filter(s->s.startsWith("1"))
                .forEach(System.out::println);*/

        //3.How to find duplicate elements in a given integers list in java using Stream functions?

        /*List<Integer> list = Arrays.asList(23,43,45,65,12,14,11,89,12);
        Set set = new HashSet<>();
            list.stream()
                    .filter(n-> !set.add(n))
                    .forEach(System.out::println);*/

        //4. Given the list of integers, find the first element of the list using Stream functions?
    /*    List<Integer> list = Arrays.asList(23,43,45,65,12,14,11,89,12);
        list.stream()
                .findFirst()
                .ifPresent(System.out::println);*/
        //5. Given a list of integers, find the total number of elements present in the list using Stream functions?

       /* List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        final long count = myList.stream()
                .count();
        System.out.println(count);*/
       // 6. Given a list of integers, find the maximum value element present in it using Stream functions?
/*        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        int max = myList.stream()
                .max(Integer::compare)
                .get();

        System.out.println(max);*/
///////////
/*        List<String> strings= Arrays.asList("sourabhKothari","pranet","siddh","orange","apple");

       Map<Integer,List<String>> map= strings.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println("Grouped Strings "+map);*/




/*        List<String> strings = Arrays.asList("apple", "banana", "cherry");

        Map<String, Integer> stringLengths = strings.stream()
                .collect(Collectors.toMap(
                        s -> s, // Use the string itself as the key
                        String::length // Map each string to its length
                ));

        // Print the string lengths
        stringLengths.forEach((string, length) ->
                System.out.println(string + ": " + length));*/

        Hashtable<String,String> table = new Hashtable<>();
        table.hashCode();



            }
        }



