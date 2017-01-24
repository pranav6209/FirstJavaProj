public class Class10HWTest {

	public static void main(String[] args) {

		Class10HWCustomer cr = new Class10HWCustomer("Pranav", "Patel",
				1234567890, "abcd@gmail.com");

		System.out.println("Customer First Name:" + cr.firstName
				+ "\nCustomer Last Name:" + cr.LastName + "\nCustomer Cell No:"
				+ cr.cellNo + "\nCustomer Email:" + cr.Email);

		System.out.println();

		Class10HWProduct pr = new Class10HWProduct("IDABCCD", "PRODUCT NAME",
				100.12f);

		System.out.println("Product Id" + pr.id + "\nProduct Name:" + pr.name
				+ "\nProduct Price" + pr.price);

		// System.out.println("Product Id" + pr.id);
		// System.out.println("Product Name:" + pr.name);
		// System.out.println("Product Price" + pr.price);

	}
};
