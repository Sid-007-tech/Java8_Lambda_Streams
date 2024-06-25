package Lambda;

public class StringBuilderThreadSafetyDemo implements Runnable {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder(); // Create a StringBuilder object

        // Create multiple threads that concurrently modify the StringBuilder
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                stringBuilder.append("A"); // Append "A" 1000 times
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                stringBuilder.append("B"); // Append "B" 1000 times
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final contents of the StringBuilder
        System.out.println("Final StringBuilder content: " + stringBuilder.toString());
    }

    @Override
    public void run() {

    }
}
