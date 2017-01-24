public class Class09Test {
	public static void main(String[] args) {

		/*
		 * JVM will create an object. JVM will allocate block of memory for
		 * variable we have defined for here Acc NO (int) and Balance (float)
		 * 
		 * See the pic...
		 * 
		 * Class9SavingAccount account1 below is similar to int i we defined. 
		 * account1,2 is reference variable we used to store object reference.
		 * new keyword is used to request JVM to create an object.
		 * Class9SavingAccount(); is calling a constructor. 
		 * use of constructor is to initialize of an object. 
		 * 
		 * so three part creating an object. Declaring reference variable Class09SavingAccount account1,new keyword and call to constructor.
		 */

		Class09SavingAccount account1 = new Class09SavingAccount();

		
		// if we do below, we are creating a reference variable.It is not referring to anything.
		
		//Class09SavingAccount account2;
		
		//if we do below, object is created but as we are not storing anywhere it is not reachable.
		
		//new Class09SavingAccount()
		
		
		Class09SavingAccount account2 = new Class09SavingAccount();

		// initializing an object means assigning initial value to the object.
		account1.accounNo = 101;
		account1.balance = 5000;

		System.out.println("AccountNo:" + account1.accounNo);
		System.out.println("Balance:" + account1.balance);

		// initializing an object means assigning initial value to the object.
		account2.accounNo = 102;
		account2.balance = 10000;

		System.out.println("AccountNo:" + account2.accounNo);
		System.out.println("Balance:" + account2.balance);

	}
}
