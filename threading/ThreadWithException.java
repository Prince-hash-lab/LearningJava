package threading;

// Importing Classes/Files
// import java.io.*;

// Child Class(Thread) is inherited
// from parent Class(GFG)
class pfd extends Thread {
	public void run()
	{
		System.out.println("Throwing in "
						+ "MyThread");
		throw new RuntimeException();
	}
}

// Main driver method
public class ThreadWithException {
	public static void main(String[] args)
	{
		pfd t = new pfd();
		t.start();

		// try block to deal with exception
		try {
			Thread.sleep(2000);
		}

		// catch block to handle the exception
		catch (Exception x) {
			// Print command when exception encountered
			System.out.println("Exception" + x);
		}

		// Print command just to show program
		// run successfully
		System.out.println("Completed");
	}
}
