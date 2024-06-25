package Threading;

import java.util.WeakHashMap;

class MyRunnable extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running...");
        try {
            System.out.println("state :"+Thread.currentThread().getState());
            Thread.sleep(10000);
            System.out.println("Thread is waiting..");
            System.out.println("state :"+Thread.currentThread().getState());// Timed Waiting
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread is finished.");
    }
}

public class ThreadLifecycleDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnable()); // New
        System.out.println("Thread state after creation: " + thread.getState());

        thread.start(); // Runnable
        System.out.println("Thread state after calling start(): " + thread.getState());

            thread.join(); // Wait for the thread to terminate

        System.out.println("Thread state after termination: " + thread.getState()); // Terminated

    }
}

