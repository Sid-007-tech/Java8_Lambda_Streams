package Threading;

public class MainContextSwitch {

        public static void main(String[] args) {
            MyThread t1 = new MyThread();
            MyThread t2 = new MyThread();

            t1.start();
            t2.start();

            try {
                t1.join(); // main() waits for t1 to finish
                t2.join(); // main() waits for t2 to finish
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("main() has finished");
        }


}
