// always good to import particular class instead of a package. so we can understand which class is from which package.

public class Class16Test {

	public static void main(String[] args) {

		// we have to use import because we want to import from outside the
		// package.
		Class16JuniorSavingAccount account = new Class16JuniorSavingAccount(
				101, 5000);

		account.withdrawal(100, 1234);
	}

}
