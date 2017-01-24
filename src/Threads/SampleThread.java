package Threads;

public class SampleThread extends Thread {
	// Creating a user defined thread.
	// we can override run method and assign task to that.
	@Override
	public void run() {
		// Getting name of thread running run method
		System.out.println("run() is execute by:"
				+ Thread.currentThread().getName());

		for (int i = 0; i < 5; i++) {
			System.out.print(i);

		}

	}

}
