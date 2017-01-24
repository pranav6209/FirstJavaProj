// Implementing cloneble for clone method.
public class Class19SavingAccount implements Cloneable {

	int accounNo;
	float balance;
	static float intrestRate = 4.25f;

	// Always add default constructor.
	public Class19SavingAccount() {

	}

	// always initialize variable in super class so other subclass can use it.
	public Class19SavingAccount(int accounNo, float balance) {
		this.accounNo = accounNo;// local variable
		this.balance = balance;// local variable
	}

	@Override
	// We have to follow same method signature. As we are Overriding.
	// we can store subclass object variable(savingAccount2) in to super
	// class object variable(obj).we can write our own method. but better to
	// override so comparison is override.
	// http://docs.oracle.com/javase/7/docs/api/. 
	//It should follow all rules mentioned here.
	public boolean equals(Object obj) {

		// Casting obj in to savingAccount2 as they both are diff.
		Class19SavingAccount savingAccount2 = (Class19SavingAccount) obj;
		// Implicitly pass. Available to this method.
		Class19SavingAccount savingAccoun1 = this;

		// to make sure null functionality. from documentation.
		if (savingAccount2 == null)
			return false;

		if ((savingAccoun1.accounNo == savingAccount2.accounNo)
				& (savingAccoun1.balance == savingAccount2.balance)) {

			return true;
		} else
			return false;

	}

	@Override
	public String toString() {

		return "AccountNO:" + accounNo + "\n" + "Balance :" + balance;

	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();

	}

}
