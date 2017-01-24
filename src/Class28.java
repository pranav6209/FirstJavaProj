import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Class28 {

	public static void main(String[] args) {

		Class12SavingAccount account1 = new Class12SavingAccount(101, 5000);
		Class12SavingAccount account2 = new Class12SavingAccount(102, 5000);
		Class12SavingAccount account3 = new Class12SavingAccount(103, 5000);
		Class12SavingAccount account4 = new Class12SavingAccount(104, 5000);

		LinkedList<Class12SavingAccount> savingAccountList1 = new LinkedList<Class12SavingAccount>();

		savingAccountList1.add(account1);// 0
		savingAccountList1.add(account2);// 1
		savingAccountList1.add(account3);// 2
		savingAccountList1.add(account4);// 3

		// listIterator. All the method is based on index in listItterator

		// savingAccountList1.listIterator(); We have to obtain listItterator
		// object reference.

		ListIterator<Class12SavingAccount> listIterator = savingAccountList1
				.listIterator();

		// It will check any element after cursor, if it is it will return true.
		System.out.println(listIterator.hasNext());

		// It will check any element before cursor, if it is it will return
		// true.
		System.out.println(listIterator.hasPrevious());

		// it will move to next and elemnt and we are storing.
		Class12SavingAccount temp_account = listIterator.next();

		// It will check any element before cursor, if it is it will return
		// true.
		System.out.println(listIterator.hasPrevious());
		// Moving to next element means index 1
		listIterator.next();
		// Storing and Printing 
		Class12SavingAccount temp_account1 = listIterator.next();

		System.out.println("AccountNo temp_account:" + temp_account.accounNo);
		System.out.println("AccountBalance temp_account:" + temp_account.balance);
		System.out.println();
		System.out.println("AccountNo temp_account1:" + temp_account1.accounNo);
		System.out.println("AccountBalance temp_account1:" + temp_account1.balance);


	}
}
