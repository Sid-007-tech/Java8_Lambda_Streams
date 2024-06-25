package Threading;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class QueueExample {
    public static void main(String[] args) {

            Queue<String> testStringsPQ = new PriorityQueue<>();
            testStringsPQ.add("abcd");
            testStringsPQ.add("1234");
            testStringsPQ.add("23bc");
            testStringsPQ.add("zzxx");
            testStringsPQ.add("abxy");

        Stack<String> stringStack = new Stack<>();
        stringStack.add("abcd");
        stringStack.add("1234");
        stringStack.add("23bc");
        stringStack.add("zzxx");
        stringStack.add("abxy");

        System.out.println("first element"+stringStack);
            System.out.println("Strings Stored in Natural Ordering in a Priority Queue\n");
            while (!testStringsPQ.isEmpty()) {
                System.out.println(testStringsPQ.poll());
            }
        }

}
