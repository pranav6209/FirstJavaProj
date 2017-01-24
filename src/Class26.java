import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Class26 extends Object {

	public static void main(String[] args) {

		Class12SavingAccount account1 = new Class12SavingAccount(101, 5000);
		Class12SavingAccount account2 = new Class12SavingAccount(102, 5000);
		Class12SavingAccount account3 = new Class12SavingAccount(103, 5000);
		Class12SavingAccount account4 = new Class12SavingAccount(104, 5000);

/*		// Syntax int[] arr = new int[5];

		Class12SavingAccount[] accontsArray = new Class12SavingAccount[4];

		accontsArray[0] = account1;
		accontsArray[1] = account2;
		accontsArray[2] = account3;
		accontsArray[3] = account4;

		
		 * Syntax for (int i : arr) { System.out.println(i);
		 * 
		 * }
		 

		for (Class12SavingAccount Class12SavingAccount : accontsArray) {

			System.out.println("AccountNo:" + Class12SavingAccount.accounNo);
			System.out.println("Balance:" + Class12SavingAccount.balance);
			System.out.println();
		}*/

		// ////////////////////////////////////////////////////////////

		// <> represent what type of elements we want to store in to collection.

		/*
		 * ArrayList<Class12SavingAccount> class12SavingAccountsList = new
		 * ArrayList<Class12SavingAccount>();
		 * 
		 * class12SavingAccountsList.add(account1);
		 * class12SavingAccountsList.add(account2);
		 * class12SavingAccountsList.add(account3);
		 * class12SavingAccountsList.add(account4);
		 * 
		 * 
		 * No of element in collections
		 * 
		 * 
		 * System.out.println("Array Size:" + class12SavingAccountsList.size());
		 * 
		 * 
		 * to search in collection. Boolean Value returned. it uses equals
		 * method Internally.
		 * 
		 * 
		 * 
		 * System.out.println(class12SavingAccountsList.contains(account3));
		 * 
		 * for (Class12SavingAccount Class12SavingAccount :
		 * class12SavingAccountsList) { System.out.println("AccountNo:" +
		 * Class12SavingAccount.accounNo); System.out.println("Balance:" +
		 * Class12SavingAccount.balance); System.out.println();
		 * 
		 * }
		 */

		// //////////////////////////////////////////////////////
		// Add, Size, contains all method can be used as same like arrayList.
/*
		LinkedList<Class12SavingAccount> class12SavingAccountsList = new LinkedList<Class12SavingAccount>();
		
		class12SavingAccountsList.add(account1);
		class12SavingAccountsList.add(account2);
		class12SavingAccountsList.add(account3);
		class12SavingAccountsList.add(account4);

		// toArray method store collection data in to Array.

		// Object[] is super class object so we can store any type of object.it is used to store data in to array.

		Object[] objectArray = class12SavingAccountsList.toArray();

		for (Object object : objectArray) {

			Class12SavingAccount savingAccount = (Class12SavingAccount) object;

			System.out.println("AccountNo:" + savingAccount.accounNo);
			System.out.println("Balance:" + savingAccount.balance);
			System.out.println();

		}*/

		// /////////////////////////////////////////////////
		
		  Class12SavingAccount[] savingAccountArray = new Class12SavingAccount[4];
		  Class12SavingAccountsList.toArray(savingAccountArray); 
		  for (Class12SavingAccount class12SavingAccount : savingAccountArray) {
		  
		  System.out.println("AccountNo:" + savingAccount.accounNo);
		  System.out.println("Balance:" + savingAccount.balance);
		  System.out.println();
		  
		  }
		 

	}
}
