// we have to implements comparable Interface and Override compareTo 
//method in order to use sort method in Class30.java
public class Class31SavingAccount implements Comparable<Class31SavingAccount> {

	int accounNo;
	float balance;
	static float intrestRate = 4.25f;

	// Always add default constructor.
	public Class31SavingAccount() {
		super();
	}

	// always initialize variable in super class so other subclass can use it.
	public Class31SavingAccount(int accounNo, float balance) {
		this.accounNo = accounNo;// local variable
		this.balance = balance;// local variable
	}

	// See API for more detail. Standard Method.
	@Override
	public int compareTo(Class31SavingAccount account2) {

		Class31SavingAccount account1 = this;

		if (account1.accounNo > account2.accounNo) {
			return 1;
		} else if (account1.accounNo < account2.accounNo) {
			return -1;
		}
		return 0;

	}
}
