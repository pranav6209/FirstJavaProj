import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class Class29 {

	public static void main(String[] args) {

		Class12SavingAccount account1 = new Class12SavingAccount(101, 5000);
		Class12SavingAccount account2 = new Class12SavingAccount(102, 5000);
		Class12SavingAccount account3 = new Class12SavingAccount(103, 5000);
		Class12SavingAccount account4 = new Class12SavingAccount(104, 5000);

		// Vector<Class12SavingAccount> savingAccountList1 = new
		// Vector<Class12SavingAccount>();
		//
		// savingAccountList1.add(account1);// 0
		// savingAccountList1.add(account2);// 1
		// savingAccountList1.add(account3);// 2
		// savingAccountList1.add(account4);// 3
		//
		// ListIterator<Class12SavingAccount> listIterator = savingAccountList1
		// .listIterator();
		//
		// listIterator.next();
		//
		// // With Vector class we need enumeration to read object data.
		// Enumeration<Class12SavingAccount> enumeration = savingAccountList1
		// .elements();
		//
		//
		// // while loop to iterate through Vector.
		// while (enumeration.hasMoreElements()) {
		// Class12SavingAccount class12SavingAccount = enumeration
		// .nextElement();
		//
		// System.out.println("Account NO:" + class12SavingAccount.accounNo);
		// System.out.println("Account NO:" + class12SavingAccount.balance);
		// System.out.println();
		// }
		// ////////////////////////////////////////////////////////////////////////////////////
		HashSet<Class12SavingAccount> savingAccountList1 = new HashSet<Class12SavingAccount>();

		savingAccountList1.add(account1);// 0
		savingAccountList1.add(account2);// 1
		savingAccountList1.add(account3);// 2
		savingAccountList1.add(account4);// 3

		Iterator<Class12SavingAccount> iterator = savingAccountList1.iterator();

		while (iterator.hasNext()) {
			Class12SavingAccount class12SavingAccount = iterator.next();
			System.out.println("Account NO:" + class12SavingAccount.accounNo);
			System.out.println("Account NO:" + class12SavingAccount.balance);
			System.out.println();

		}

	}
}
