
public class Class10SavingAccount {

	// properties or fields or instance variable
	int accounNo;
	float balance;

	// //////////////////////////////////////////////////////////////////////////////////////
	// Class10
	// Default Constructor. if we don't create constructor and create object JVM
	// will create automatically.
	public Class10SavingAccount() {
		// TODO Auto-generated constructor stub
	}

	// ///////////////////////////////////////////////////////////////////////////////////////

	// // Generate Constructor using fields. Right Click Source.

	public Class10SavingAccount(int accounNo, float balance) {

		// this refers to current object reference.
		this.accounNo = accounNo;// local variable passed in constructor
		this.balance = balance; // local variable passed in constructor

	}

}
