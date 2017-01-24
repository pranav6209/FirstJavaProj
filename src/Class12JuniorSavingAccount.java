public class Class12JuniorSavingAccount extends Class12SavingAccount {

	public static void main(String[] args) {

		// ////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// Class12JuniorSavingAccount juniorSavingAccount = new
		// Class12JuniorSavingAccount();
		//
		// // we can access account and balance because
		// Class12JuniorSavingAccount
		//
		// juniorSavingAccount.accounNo = 101;
		// juniorSavingAccount.balance = 5000;
		//
		// System.out.println("Account No:" + juniorSavingAccount.accounNo);
		// System.out.println("Balance:" + juniorSavingAccount.balance);

		// ///////////////////////////////////////////////////////////////////////////////////////////////////////////

	}

	// extending Class12SavingAccount.Sub class doesn't inherit Constructor
	// from Super Class. but sub class can call super class Constructor.

	// Generate using source.
	// create constructor from super class and generate 2 constructor.

	public Class12JuniorSavingAccount() {

		// if we remove super constructor will still add super. so it is always
		// necessary to add default constructor in parent class.
		super();

	}

	public Class12JuniorSavingAccount(int accounNo, float balance) {
		// Calling super class constructor.
		super(accounNo, balance);
		// TODO Auto-generated constructor stub
	}

}
