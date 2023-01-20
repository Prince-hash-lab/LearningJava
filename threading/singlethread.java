package threading;

// import java.io.*;
// import java.util.*;

public class singlethread implements Runnable {
	// method to start Thread
	public void run()
	{
		System.out.println(
			"Thread is Running Successfully");
	}

	public static void main(String[] args)
	{
		singlethread g1 = new singlethread();
		// initializing Thread Object
		Thread t1 = new Thread(g1);
		t1.run();
	}
}

