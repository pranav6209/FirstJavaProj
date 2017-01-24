import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Class24 extends Object {

	public static void main(String[] args) throws SQLException {

		Class12SavingAccount savingAccount = new Class12SavingAccount(101, 5000);

		savingAccount.withdrawal(3000);
		System.out.println(savingAccount.balance);
		savingAccount = null;

		/*
		 * apart from try catch we can write if statement and avoid exceptions.
		 * There is a possibility to avoid it.so it is a good practice to use
		 * this and avoid it. Example of Unchecked Exception
		 */

		if (savingAccount != null) {
			savingAccount.withdrawal(1000);
		}

		System.out.println("Statement After Line 12");

		// //////////////////////////////////////////////////////////////////////
		/*
		 * Unchecked Exceptions: Those exceptions which we have to explicitly
		 * handle. compiler force to handle those.
		 * 
		 * We have to handle this because we can not avoid it.
		 * 
		 * Java application and we are trying to connect to DB.
		 * 
		 * We cannot just write Connection connection =
		 * DriverManager.getConnection("");
		 */

		/*
		 * we have to declare this so we can access connection outside of try
		 * catch in finally
		 */
		Connection connection = null;

		try {
			/*
			 * we can use throwable. it meant that want to use default
			 * handler.If we use throwable method where we call this method we
			 * have to use try catch or we can use throwable again
			 */
			connection = DriverManager.getConnection("");

			// db operation

			// db operation

			/*
			 * This is not the best place for connection.close, because if after
			 * connection is established and error occur it want execute it so we
			 * have to finally out of the try catch
			 */
			// connection.close();

		} catch (SQLException e) {
			/*
			 * It is method define in exception class. to print error detail. it
			 * will print error in cancel
			 */
			e.printStackTrace();
		} finally {
			if (connection != null)
				connection.close();
			/*
			 * making object null it will become unreachable code so available
			 * for GC
			 */
			connection = null;

		}
		/*
		 * only catch block is not possible. try and N number of catch possible.
		 * try and finally is possible.
		 */

	}
}
