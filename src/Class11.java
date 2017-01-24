public class Class11 {

	/*
	 * Non - static variable: Represent properties of an object, whose value may
	 * change from object to object. to access this, object.variable.
	 */

	int accounNo;
	float balance;

	// Static variables: Only one copy of static variable. Doesn't matter how
	// many object we create. Static Variable is Class level variable. value
	// will not change object to object.to access this,class.variable.

	static float intrestRate = 4.25f;

	// we have declared variable as final.So, it's value can not be changed when
	// we call it.usually use when we declare variable static.

	// final static float intrestRate = 4.25f;

	public Class11(int accounNo, float balance) {

		this.accounNo = accounNo;
		this.balance = balance;
	}

	public void withdrawal(float withdrawalAmt) {

		// Local variable : variable declared in method
		// withdrawalAmt is a local variable.

		// checking if withdrawalAmt is less than or equal to balance.business
		// logic.
		System.out.println("Withdrwal() operating on Account:" + this.accounNo);
		if (withdrawalAmt <= this.balance) {
			this.balance = this.balance - withdrawalAmt;
		} else {
			System.err.println("Insufficent Fund in the Account");
		}
	}

	public void deposit(float depositAmt) {
		// checking if Deposit is not negative.
		// business logic.
		System.out.println("Deposit() operating on Account:" + this.accounNo);
		if (depositAmt > 0) {
			this.balance = this.balance + depositAmt;
		} else if (depositAmt == 0) {
			System.err.println("Deposit amt Zero");
		} else {

			System.err.println("Deposit Amt is Negative");
		}
	}

}
