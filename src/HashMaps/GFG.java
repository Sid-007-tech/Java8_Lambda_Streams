package HashMaps;

// Java program to illustrate HashMap class
// of java.util package

// Importing HashMap class
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Main class
public class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // Create an empty hash synncMap by declaring object
        // of string and integer type
        HashMap<String, Integer> map = new HashMap<>();
        Map<String,Integer> synncMap=Collections.synchronizedMap(map);
        

        // Adding elements to the Map
        // using standard put() method
        synncMap.put("vishal", 10);
        synncMap.put("sachin", 30);
        synncMap.put("vaibhav", 20);
        synncMap.put("Sidd",null);
        synncMap.put(null,2);
        synncMap.put(null,3);
        synncMap.put(null,4);

        // Print size and content of the Map
        System.out.println("Size of synncMap is:- "
                + synncMap.size());

        // Printing elements in object of Map
        System.out.println(synncMap);

        // Checking if a key is present and if
        // present, print value by passing
        // random element
       /* if (synncMap.containsKey("vishal")) {

            // Mapping
            Integer a = synncMap.get("vishal");

            // Printing value for the corresponding key
            System.out.println("value for key"
                    + " \"vishal\" is:- " + a);
        }*/
    }
}
