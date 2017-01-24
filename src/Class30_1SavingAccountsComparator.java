import java.util.Comparator;

public class Class30_1SavingAccountsComparator implements
		Comparator<Class30_1SavingAccount> {

	@Override
	public int compare(Class30_1SavingAccount account1,
			Class30_1SavingAccount account2) {
		if (account1.accounNo > account2.accounNo) {
			return 1;
		} else if (account1.accounNo < account2.accounNo) {
			return -1;
		}
		return 0;

	}
}