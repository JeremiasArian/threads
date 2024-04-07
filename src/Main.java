/* The JVM creates a thread responsible for executing the main method,
so this "default" thread created by the JVM is going to be the first one.
 */
public class Main {
    public static void main(String[] args) {
            // Create a second thread and stops it.

            // Thread thread = new Thread();
            // System.out.println("Second thread started.");
            // thread.start();
            // System.out.println("Second thread stopped.");

            // Start and stop a third thread.
            ThirdThread third = new ThirdThread();
            third.start();

            // Start and stop a fourth thread.
            Runnable runnable = new FourthThread();
            Thread thread = new Thread(runnable);
            thread.start();
    }
}