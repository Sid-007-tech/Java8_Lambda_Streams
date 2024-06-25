package Streams;

import java.util.*;
import java.util.stream.*;

class streamExample {
    public static void main(String args[]) {
        // Create a list of strings
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        // Demonstration of filter method
        List<String> filteredWords = words.stream()
                .filter(s -> s.startsWith("a"))
                .collect(Collectors.toList());

        System.out.println("Words starting with 'a': " + filteredWords);

        // Demonstration of map method
        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println("Lengths of words: " + wordLengths);

        // Demonstration of sorting
        List<String> sortedWords = words.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted words: " + sortedWords);

        // Demonstration of reduce method
        int totalLength = words.stream()
                .mapToInt(String::length)
                .reduce(0, Integer::sum);

        System.out.println("Total length of all words: " + totalLength);
    }
}
