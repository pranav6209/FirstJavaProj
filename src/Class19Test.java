import java.lang.reflect.Method;

public class Class19Test extends Object {

	public static void main(String[] args) throws CloneNotSupportedException {

		Class19SavingAccount account1 = new Class19SavingAccount(101, 5000);
		Class19SavingAccount account2 = new Class19SavingAccount(101, 5000);

		System.out.println("account1 == account2");
		System.out.println(account1 == account2);

		// This will return False before overriding equals method.as equals
		// method is same == operator
		System.out.println("account1equalsaccount2");
		System.out.println(account1.equals(account2));

		// if we pass null . it will pass in object and stored in obj and object
		// and via casting it will be stored in savingAccount2 and when we use
		// savingAccount2 to call method it will throw null
		// pointer.SavingAccount2.account

		System.out.println(account1.equals(null));

		// //////////////////////////////////////////////////////////////
		// we are comparing with String class. in String Class Methods are
		// over ridden so we will do the same with Saving Account Class.

		// Calling constructor of String Class and Passing data Hello.

		// s1 and s2 are not referring to same object variable. so it will
		// return false. and it will not check data.

		String s1 = new String("Hello");
		String s2 = new String("Hello");

		// s1 and s2 are not referring to same object variable. so it will
		// return false. and it will not check data.

		System.out.println("s1=s2");
		System.out.println(s1 == s2);

		// s1 and s2 contains same data so it will return True.
		System.out.println("s1equalss2");
		System.out.println(s1.equals(s2));

		// //HashCode Method.
		System.out.println("HashCode For Account1");
		System.out.println(account1.hashCode());

		System.out.println("HashCode For Account2");
		System.out.println(account2.hashCode());

		// Hashcode value for sting object (s1 and s2) is same as there is same
		// data.

		System.out.println("HashCode For S1");
		System.out.println(s1.hashCode());

		System.out.println("HashCode For S2");
		System.out.println(s2.hashCode());

		// Printing reference variable value with toString Method.It will print
		// class name and hashvalue before overriding
		System.out.println("Printing Referace Variable Value for account 1");
		System.out.println(account1);
		System.out.println("Printing Referace Variable Value for account 2");
		System.out.println(account2);
		// It will print contains stores as it is overridden
		System.out.println("Printing Referace Variable Value for s1");
		System.out.println(s1.toString());
		System.out.println("Printing Referace Variable Value for s2");
		System.out.println(s2.toString());

		// toString Method. whenever we try to print referance variable
		// internally tostring method is called
		System.out
				.println("Printing Referace Variable Value for account 1 using toString");
		System.out.println(account1.toString());

		// getClass Method.
		Class class1 = account1.getClass();

		// This will return class name:
		System.out.println("Class Name:" + class1.getName());

		// To get all the methods in class. This is called reflection Method
		// where we are getting details of class in run time.

		Method[] methodArray = class1.getMethods();

		for (Method method : methodArray)

			System.out.println("Method Name:" + method.getName());

		// Clone Method is creating clone of an Object.

		Class19SavingAccount savingaccount1clone = (Class19SavingAccount) account1
				.clone();

		System.out.println("AccountNo" + savingaccount1clone.accounNo);

		System.out.println("AccountNo" + savingaccount1clone.balance);

		// This will return false as clone and original are diff object
		
		System.out.println(account1 == savingaccount1clone);
	}
}
