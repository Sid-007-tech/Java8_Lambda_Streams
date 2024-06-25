package OOPsPractice;

import java.util.ArrayList;
import java.util.List;

public class GFG {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        // Conversion
        System.out.println(arr);
        Object[] objects = arr.toArray();
        // Printing array of objects
        for (Object obj : objects)
            System.out.print(obj + " ");
    }
}

