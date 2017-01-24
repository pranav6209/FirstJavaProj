import java.lang.reflect.Method;

// Actually Class 21

public class Class22Test extends Object {

	public static void main(String[] args) {

		Class22Sample sample1 = Class22Sample.getSample();

		Class22Sample sample2 = Class22Sample.getSample();

		// Both are refering to same object variable and it is a singleton
		// pattern
		System.out.println(sample1 == sample2);

	}
}