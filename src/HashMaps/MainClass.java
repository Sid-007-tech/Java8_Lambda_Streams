package HashMaps;

import java.util.*;
import java.util.Map.Entry;

public class MainClass {
    public static void main(String[] args) throws Exception {
        //Creating the HashMap


        System.out.println(Class.forName("String").getName());
        HashMap<String, String> map = new HashMap<>();

        //Adding key-value pairs to HashMap
        map.put("ONE", "AAA");
        map.put("TWO", "BBB");
        map.put("THREE", "CCC");
        map.put("FOUR", "DDD");
        map.put("FIVE", "EEE");

        HashSet set = new HashSet();

        Set<String> keys = map.keySet();
        Iterator<String> it = keys.iterator();
        for (String its : keys
        ) {
            System.out.println(its + "..");

        }
        /*Set<Entry<String, String>> entrySet=map.entrySet();
        for (Entry<String,String> entry:entrySet) {
            System.out.println(entry);
        }

        map.remove("ONE");
        System.out.println("after removal");
        Set<Entry<String, String>> entrySet2=map.entrySet();
        for (Entry<String,String> entry:entrySet2) {
            System.out.println(entry.getKey()+" => "+entry.getValue());
        }

        m1(new Integer(10));
        m1(new Float(10.0f));
        m1(10);
        m1(10.0);
    }
    static void m1(Number number){
        System.out.println(number.toString());
    }*/
    }
}
