public class Class22Sample {

	// when class is loaded it will create an object sample

	private static Class22Sample sample = new Class22Sample();

	// TO make class Singleton making constrictor Private so no one can Create
	// an Object
	private Class22Sample() {

	}

	// creating method which will return sample object.
	public static Class22Sample getSample() {
		return sample;
	}
}
