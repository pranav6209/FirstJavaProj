public class Class25SavingAccount {

	int accounNo;
	float balance;
	static float intrestRate = 4.25f;

	public Class25SavingAccount() {
		super();
	}

	public Class25SavingAccount(int accounNo, float balance) {
		this.accounNo = accounNo;
		this.balance = balance;
	}

	// throws only when Class25InsufficientException is unchecked exception
	public void withdrawal(float withdrawalAmt)
			throws Class25InsufficientException {

		System.out.println("Withdrwa() operating on Account:" + this.accounNo);
		if (withdrawalAmt <= this.balance) {
			this.balance = this.balance - withdrawalAmt;
		} else {

			/* For checked Exceptions */
			// Creating Exception Object.
			throw new Class25InsufficientException();
			/*
			 * we have to hand over exception object to runtime system so we
			 * have to use throws clause.
			 */
		}
	}

}
