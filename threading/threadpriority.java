package threading;
// import java.lang.*;
public class threadpriority extends Thread {
 
    // Method 1
    // run() method for the thread that is
    // invoked as threads are started
    public void run()
    {
        // Print statement
        System.out.println("Inside run method");
    }
 
    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
        // main thread priority is set to 6 now
        Thread.currentThread().setPriority(6);
 
        // Current thread is accessed
        // using currentThread() method
 
        // Print and display main thread priority
        // using getPriority() method of Thread class
        System.out.println(
            "main thread priority : "
            + Thread.currentThread().getPriority());
 
        // Creating a thread by creating object inside
        // main()
        threadpriority t1 = new threadpriority();
 
        // t1 thread is child of main thread
        // so t1 thread will also have priority 6
 
        // Print and display priority of current thread
        System.out.println("t1 thread priority : "
                           + t1.getPriority());
    }
}