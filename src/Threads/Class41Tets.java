package Threads;

public class Class41Tets extends Object {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Start of Main()");

		Class41SampleThread sampleThread1 = new Class41SampleThread();

		// if we don't start thread, main thread will execute run method and
		// we can use sampleThread1.run();but it will not start thread

		sampleThread1.setName("userThread1");

		// start method will start thread and run a method internally.
		sampleThread1.start();

		Class41SampleThread sampleThread2 = new Class41SampleThread();

		// if we don't start thread main thread will execute run method.
		sampleThread1.setName("userThread2");

		sampleThread2.start();

		System.out.println("End of Main()");
	}

}
