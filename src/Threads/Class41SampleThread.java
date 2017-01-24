package Threads;

public class Class41SampleThread extends Thread {
	// Creating a user defined thread.
	// we can override run method and assign task to that.
	@Override
	public void run() {
		// Getting name of thread running run method
		System.out.println("run() is execute by:"

		+ Thread.currentThread().getName());

		// this it the additional condition if we want only first thread to
		// sleep while executing run method.

		if (Thread.currentThread().getName().equals("userThread1")) {
			try {
				Thread.sleep(500);
			}

			catch (Exception e) {
				e.printStackTrace();
			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.print(i);

		}

	}
}
