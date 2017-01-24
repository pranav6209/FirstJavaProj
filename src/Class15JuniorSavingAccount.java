public class Class15JuniorSavingAccount extends Class15SavingAccount {

	public Class15JuniorSavingAccount() {

		// if we remove super constructor will still add super. so it is always
		// necessary to add default constructor in parent class.
		super();
		// TODO Auto-generated constructor stub
	}

	public Class15JuniorSavingAccount(int accounNo, float balance) {
		// Calling super class constructor.
		super(accounNo, balance);
		// TODO Auto-generated constructor stub
	}

	public void getDetails() {

		System.out.println("AccountNo:" + accounNo);
		System.out.println("AccountBalance:" + balance);
	}

	@Override
	// method signature withdrawal (float, int)
	 public void withdrawal(float withdrawalAmt, int pincode) {
		// business logic.
		System.out.println("Withdrwa() operating on Account:" + this.accounNo);
		// checking if Pin is correct or not.
		if (pincode == 1234) {
			// checking if withdrawalAmt is less than 200 for junior acc.
			if (withdrawalAmt <= 200) {
				// Method Call withdrawal from bank
				withdrawal(withdrawalAmt);
			} else {
				System.err.println("Withdrwal amt for the card is exceeded.");
			}
		} else {
			System.err.println("Invalid Pin");
		}
	}

}
