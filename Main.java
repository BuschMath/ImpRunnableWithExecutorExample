/* Implements two different approaches to implementing 
 *      Runnable.
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        // Create a fixed-size thread pool with two threads
        ExecutorService executor = Executors.newFixedThreadPool(2);
        
        // Submit two tasks to the thread pool
        executor.submit(new MyTask(1));
        executor.submit(new MyTask(2));

        Runnable r3 = TaskTwo(3);
        Runnable r4 = TaskTwo(4);

        executor.submit(r3);
        executor.submit(r4);
        
        // Shut down the thread pool once all tasks have completed
        executor.shutdown();
    }

    public static Runnable TaskTwo(int taskId) {
        return ()->
        {
            System.out.println("TaskID: " + taskId + " is running.");
        };
    }
}
