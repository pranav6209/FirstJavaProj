public class Class16SavingAccount {

	public int accounNo;
	public float balance;

	// Always add default constructor.
	public Class16SavingAccount() {
		super();
	}

	// always initialize variable in super class so other subclass can use it.
	public Class16SavingAccount(int accounNo, float balance) {
		this.accounNo = accounNo;// local variable
		this.balance = balance;// local variable
	}

	// withdrawal from bank
	// Method Signature withdrawal(float)
	// Method OverLoading.
	public void withdrawal(float withdrawalAmt) {
		// checking if withdrawalAmt is less than or equal to balance.business
		// logic.
		System.out.println("Withdrwa() operating on Account:" + this.accounNo);
		if (withdrawalAmt <= this.balance) {
			this.balance = this.balance - withdrawalAmt;

		} else {
			System.err.println("Insufficent Fund in the Account");
		}
	}

	// withdrawal from ATM.
	// Method Signature withdrawal(flaot, int)
	// // Method OverLoading.
	public void withdrawal(float withdrawalAmt, int pincode) {
		// business logic.
		System.out.println("Withdrwa() operating on Account:" + this.accounNo);
		// checking if Pin is correct or not.
		if (pincode == 1234) {
			// checking if withdrawalAmt is less than 800
			if (withdrawalAmt <= 800) {
				// Method Call withdrawal from bank
				withdrawal(withdrawalAmt);
			} else {
				System.err.println("Withdrwal amt for the card is exceeded.");
			}
		} else {
			System.err.println("Invalid Pin");
		}
	}

	public void deposit(float depositAmt) {
		// checking if Deposit is not negative.business
		// logic.
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
