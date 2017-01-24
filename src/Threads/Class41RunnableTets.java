package Threads;

public class Class41RunnableTets extends Object {

	public static void main(String[] args) {

		// Main thred is parent thread
		// testrunnable thread we are creating is a child thred.
		// because we are creating testrunnable in context of main thread.

		Class41SampleThreadRunnable testRunnable = new Class41SampleThreadRunnable();

		// passing obj testRunnable to Thread class.

		Thread thread = new Thread(testRunnable);

		thread.setName("test runnable");

		thread.start();

		// we don't have to create thread object to use this methods.

		System.out.println("Minimum Priority :" + Thread.MIN_PRIORITY);

		System.out.println("Maximum Priority :" + Thread.MAX_PRIORITY);

		System.out.println("Normal Priority :" + Thread.NORM_PRIORITY);

		// test runnable and main both have 5 priority
		System.out.println("Test Runnabel" + thread.getPriority());

	}
}
