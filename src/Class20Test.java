import java.lang.reflect.Method;

// Actually Class 21

public class Class20Test extends Object {

	public static void main(String[] args) {

		// we can not use as new keyword. Constructor is private. if we don't
		// want other to create object of a class.
		Runtime runtime = Runtime.getRuntime();

		System.out.println("Total Memory : " + runtime.totalMemory());
		System.out.println("Free Memory Before Creating Object : "
				+ runtime.freeMemory());

		for (int i = 0; i < 40000; i++) {

			/*
			 * it will create 40,000 saving acc object.we cannot access bse we
			 * are not storing it to any reference variable. so all are
			 * available for garbage collection
			 */
			new Class12SavingAccount(i + 1, 5000);

		}

		System.out.println("Free Memory After Creating Objects: "
				+ runtime.freeMemory());

		System.out.println("Calling GC.....");

		runtime.gc();

		System.out.println("Free Memory After Calling GC: "
				+ runtime.freeMemory());

		// ///////////////////////////////////////////////////////////

	}

}
