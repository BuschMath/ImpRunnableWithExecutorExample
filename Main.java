import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        // Create a fixed-size thread pool with two threads
        ExecutorService executor = Executors.newFixedThreadPool(2);
        
        // Submit two tasks to the thread pool
        executor.submit(new MyTask(1));
        executor.submit(new MyTask(2));
        
        // Shut down the thread pool once all tasks have completed
        executor.shutdown();
    }
}
