public class MyTask implements Runnable {
    
    private int taskId;
    
    public MyTask(int taskId) {
        this.taskId = taskId;
    }
    
    @Override
    public void run() {
        // Define the code that the thread will execute
        System.out.println("Task " + taskId + " is running.");
    }
}
