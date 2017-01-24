import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Class25 extends Object {

	public static void main(String[] args) throws SQLException {

		Class25SavingAccount savingAccount = new Class25SavingAccount(101, 5000);

		/*
		 * For Checked exceptions. we are withdrawing more than in account.
		 */
		// savingAccount.withdrawal(10000);
		// it will throw Class25InsufficientException

		// when exception is uncheked
		try {
			savingAccount.withdrawal(10000);
		} catch (Class25InsufficientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
