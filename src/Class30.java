import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.Vector;

public class Class30 {

	public static void main(String[] args) {

		Class30SavingAccount account1 = new Class30SavingAccount(102, 5000);
		Class30SavingAccount account2 = new Class30SavingAccount(101, 6000);
		Class30SavingAccount account3 = new Class30SavingAccount(104, 7000);
		Class30SavingAccount account4 = new Class30SavingAccount(103, 8000);
		Class30SavingAccount account5 = new Class30SavingAccount(105, 9000);
		Class30SavingAccount account6 = new Class30SavingAccount(107, 10000);
		Class30SavingAccount account7 = new Class30SavingAccount(106, 11000);

		// ArrayList<Class30SavingAccount> savingAccountList1 = new
		// ArrayList<>();

		// We still have to use comparable interface because object must be
		// Comparable to sort
		TreeSet<Class30SavingAccount> savingAccountList1 = new TreeSet<>();

		savingAccountList1.add(account1); // 0
		savingAccountList1.add(account2); // 1
		savingAccountList1.add(account3); // 2
		savingAccountList1.add(account4); // 3
		savingAccountList1.add(account5); // 4
		savingAccountList1.add(account6); // 5
		savingAccountList1.add(account7); // 6

		// sort method only we have to use with ArrayList. TreeSet sort using
		// internal method.
		// sort method take collection as an i/p and internally use compare to
		// method from Class30SavingAccount.
		// Collections.sort(savingAccountList1);

		Iterator<Class30SavingAccount> iterator = savingAccountList1.iterator();

		while (iterator.hasNext()) {
			Class30SavingAccount Class30SavingAccount = iterator.next();
			System.out.println("Account NO:" + Class30SavingAccount.accounNo);
			System.out.println("Account NO:" + Class30SavingAccount.balance);
			System.out.println();

		}

	}

}
