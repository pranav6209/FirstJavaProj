// if we can't change Class30_1SavingAccount class and we cannot implement 
// comparable interface and override method and if we want to sort.
// then we have to use comparator. It is recommended to use comparable interface.

public class Class30_1SavingAccount {

	int accounNo;
	float balance;
	static float intrestRate = 4.25f;

	// Always add default constructor.
	public Class30_1SavingAccount() {
		super();
	}

	// always initialize variable in super class so other subclass can use it.
	public Class30_1SavingAccount(int accounNo, float balance) {
		this.accounNo = accounNo;// local variable
		this.balance = balance;// local variable
	}

}
