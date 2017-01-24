public class Class11Test {

	public static void main(String[] args) {

		Class11 account1 = new Class11(101, 5000.00f);

		/*
		 * Static Variable. If we want to change the value at class level. we
		 * can reassign(Class11.intrestRate). otherwise Original Value 4.25 will
		 * print from Class 11.java.if we don't want anyone want to change,use
		 * final.
		 */

		/*
		 * intrestRate: it is a static variable. so it's value assigned here
		 * will be constant for whole class. where as non static variable like
		 * account no and balance we can assign new value every time we create
		 * an object in a class.
		 */
		Class11.intrestRate = 5.25f;
		System.out.println("Intrest Rate: " + Class11.intrestRate);

		Class11 account2 = new Class11(102, 10000.00f);
		// this will through an error if we declare final.
		System.out.println("Intrest Rate: " + Class11.intrestRate);

		// ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// Withdrawal

		// Method Call
		account1.withdrawal(2000);
		System.out.println("Account No:" + account1.accounNo);
		System.out.println("Balance:" + account1.balance);
		System.out.println();
		account2.withdrawal(3000);
		System.out.println("Account No:" + account2.accounNo);
		System.out.println("Balance:" + account2.balance);

		// //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// Deposit

		// Method Call
		account1.deposit(-500);
		System.out.println("Account No:" + account1.accounNo);
		System.out.println("Balance:" + account1.balance);
		System.out.println();
		account2.deposit(300.25f);
		System.out.println("Account No:" + account1.accounNo);
		System.out.println("Balance " + account2.balance);

	}
}
