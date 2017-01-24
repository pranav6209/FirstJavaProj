import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Class27 {

	public static void main(String[] args) {

		Class12SavingAccount account1 = new Class12SavingAccount(101, 5000);
		Class12SavingAccount account2 = new Class12SavingAccount(102, 5000);
		Class12SavingAccount account3 = new Class12SavingAccount(103, 5000);
		Class12SavingAccount account4 = new Class12SavingAccount(104, 5000);
		Class12SavingAccount account5 = new Class12SavingAccount(105, 5000);
		Class12SavingAccount account6 = new Class12SavingAccount(106, 5000);

		LinkedList<Class12SavingAccount> savingAccountList1 = new LinkedList<Class12SavingAccount>();

		savingAccountList1.add(account1);
		savingAccountList1.add(account2);
		savingAccountList1.add(account3);
		savingAccountList1.add(account4);

		LinkedList<Class12SavingAccount> savingAccountList2 = new LinkedList<Class12SavingAccount>();

		savingAccountList2.add(account5);
		savingAccountList2.add(account3);
		savingAccountList2.add(account2);
		savingAccountList2.add(account6);

		// It will give 8 elements and duplicate data.

		// savingAccountList1.addAll(savingAccountList2);

		// for (Class12SavingAccount class12SavingAccount : savingAccountList1)
		// {
		//
		// System.out.println("Saving Accont No"
		// + class12SavingAccount.accounNo);
		// System.out.println("Saving Balance" + class12SavingAccount.balance);
		// System.out.println();
		//
		// }

		// ///////////////////////////////////////////////////////////////////////////////////////

		// It will Remove duplicate data

		// savingAccountList1.removeAll(savingAccountList2);
		//
		// for (Class12SavingAccount class12SavingAccount : savingAccountList1)
		// {
		//
		// System.out.println("Saving Accont No"
		// + class12SavingAccount.accounNo);
		// System.out.println("Saving Balance" + class12SavingAccount.balance);
		// System.out.println();
		//
		// }
		// //////////////////////////////////////////////////////////////////////

		// compare two collection and retain common. opposite to removeAll.

		// savingAccountList1.retainAll(savingAccountList2);
		//
		// for (Class12SavingAccount class12SavingAccount : savingAccountList1)
		// {
		//
		// System.out.println("Saving Accont No"
		// + class12SavingAccount.accounNo);
		// System.out.println("Saving Balance" + class12SavingAccount.balance);
		// System.out.println();
		//
		// }

		// //////////////////////////////////////////////////////////////////////////////////////

		// it will check all the element of second element are in first or not.
		// second collection is a subset of first or not.Boolean Method.

		// System.out.println("Checking Contains All Method:"+savingAccountList1.containsAll(savingAccountList2));
		// System.out.println();

		// /////////////////////////////////////////////////////////////////////////////////////

		// Clear Method remove all objects of collections.Make collection empty.

		// iterator method is also used to read data from element.not ant more
		// before java 5 as for each loop was not used.

		// Iterator take Class12SavingAccount as an Input.

		// Iterator<Class12SavingAccount> iterator =
		// savingAccountList1.iterator();
		//
		// while (iterator.hasNext()) {
		// Class12SavingAccount class12SavingAccount = iterator.next();
		// System.out.println("Saving Accont No"
		// + class12SavingAccount.accounNo);
		//
		// System.out.println("Saving Balance" + class12SavingAccount.balance);
		//
		// System.out.println();
		//
		// }
		// ////////////////////////////////////////////////////////////////////////////////

		// .getMethod

		// returns the element stored at index 1.

		// Class12SavingAccount savingaccont = savingAccountList1.get(1);
		//
		// System.out.println("Saving Accont No" + savingaccont.accounNo);
		//
		// System.out.println("Saving Balance" + savingaccont.balance);
		//
		// System.out.println();

		// ///////////////////////////////////////////////////////////////
		// setMethod to set at particular index.it will replace

		// savingAccountList1.set(2, account6);
		//
		// Iterator<Class12SavingAccount> iterator =
		// savingAccountList1.iterator();
		//
		// while (iterator.hasNext()) {
		// Class12SavingAccount class12SavingAccount = iterator.next();
		// System.out.println("Saving Accont No"
		// + class12SavingAccount.accounNo);
		// System.out.println("Saving Balance" + class12SavingAccount.balance);
		// System.out.println();
		//
		// }
		// ////////////////////////////////////////

		// addMethod to add at particular index.

		// savingAccountList1.add(2, account6);
		//
		// Iterator<Class12SavingAccount> iterator =
		// savingAccountList1.iterator();
		//
		// while (iterator.hasNext()) {
		// Class12SavingAccount class12SavingAccount = iterator.next();
		// System.out.println("Saving Accont No"
		// + class12SavingAccount.accounNo);
		//
		// System.out.println("Saving Balance" + class12SavingAccount.balance);
		//
		// System.out.println();
		// }

		// /////////////////////////////////////////////////////

		// remove method remove an elment at particular index
		// indexOf method return index of an element
	}
}
