package Threads;

public class Class40Tets extends Object {

	// Jvm will create thread named main.
	// and then it will assign task of executing main method.

	// public static void main(String[] args) throws InterruptedException {
	//
	// System.out.println("Start of Main()");
	//
	// // it return object reference of thread which is currently executing
	// // this method.
	//
	// Thread thread = Thread.currentThread();
	//
	// System.out.println("Thread Name:" + thread.getName());
	//
	// // Throws InterruptedException
	//
	// /*
	// * Thrown when a thread is waiting, sleeping, or otherwise occupied, and
	// * the thread is interrupted, either before or during the activity.
	// * Occasionally a method may wish to test whether the current thread has
	// * been interrupted, and if so, to immediately throw this exception. The
	// * following code can be used to achieve this effect:
	// */
	//
	// // it will wait for 6000 ms and then print end of main.
	// Thread.sleep(6000);
	// System.out.println("End of Main()");
	// }

	// ////////////////////////////////////////////////
	public static void main(String[] args) throws InterruptedException {

		System.out.println("Start of Main()");

		// Getting name of thread running main method
		System.out.println("main() is execute by:"
				+ Thread.currentThread().getName());

		// creating a sample thread.
		SampleThread sampleThread1 = new SampleThread();

		// sampleThread1.

		sampleThread1.setName("userThread1");
		// to start a thread.
		// when we call start method it will execute run method from
		// SampleThread.java
		// 2 thread are create. 1 Main thread to run main and one for
		// sampleThread which is user defined and it is alos responsible for

		sampleThread1.start();

		// creating one more thread.
		SampleThread sampleThread2 = new SampleThread();

		sampleThread2.setName("userThread2");

		sampleThread2.start();

		System.out.println("End of Main()");
	}

}
