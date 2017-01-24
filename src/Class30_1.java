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

public class Class30_1 {

	public static void main(String[] args) {

		Class30_1SavingAccount account1 = new Class30_1SavingAccount(102, 5000);
		Class30_1SavingAccount account2 = new Class30_1SavingAccount(101, 6000);
		Class30_1SavingAccount account3 = new Class30_1SavingAccount(104, 7000);
		Class30_1SavingAccount account4 = new Class30_1SavingAccount(103, 8000);
		Class30_1SavingAccount account5 = new Class30_1SavingAccount(105, 9000);
		Class30_1SavingAccount account6 = new Class30_1SavingAccount(107, 10000);
		Class30_1SavingAccount account7 = new Class30_1SavingAccount(106, 11000);

		// ArrayList<Class30_1SavingAccount> savingAccountList1 = new
		// ArrayList<>();

		// TreeSet we have to pass new Class30_1SavingAccountsComparator() as a
		// constructor
		// as there is no sort method.

		TreeSet<Class30_1SavingAccount> savingAccountList1 = new TreeSet<>(
				new Class30_1SavingAccountsComparator());

		savingAccountList1.add(account1); // 0
		savingAccountList1.add(account2); // 1
		savingAccountList1.add(account3); // 2
		savingAccountList1.add(account4); // 3
		savingAccountList1.add(account5); // 4
		savingAccountList1.add(account6); // 5
		savingAccountList1.add(account7); // 6

		// sort method take collection as an i/p and internally use compare to
		// method

		// overloaded sort Method we have to use.

		// Collections.sort(savingAccountList1,
		// new Class30_1SavingAccountsComparator());

		Iterator<Class30_1SavingAccount> iterator = savingAccountList1
				.iterator();

		while (iterator.hasNext()) {
			Class30_1SavingAccount Class30_1SavingAccount = iterator.next();
			System.out.println("Account NO:" + Class30_1SavingAccount.accounNo);
			System.out.println("Account NO:" + Class30_1SavingAccount.balance);
			System.out.println();

		}

	}
}
