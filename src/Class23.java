public class Class23 extends Object {

	public static void main(String[] args) {

		Class12SavingAccount savingAccount = new Class12SavingAccount(101, 5000);

		try {
			savingAccount.withdrawal(3000);
			System.out.println(savingAccount.balance);
			savingAccount = null;
			savingAccount.withdrawal(1000);
			System.out.println("Statement After Line 12");

			// We can (NullPointerException e) means it will hande only
			// nullpointer
			// Exception
		} catch (ArithmeticException e) {

			/*
			 * it will create Null Pointer Exception.Null Pointer exception
			 * class object class is created in which error detail is stored.
			 * Catch Block is always execute.
			 * 
			 * We can write any type of code in Catch Block.If we take an
			 * example abt Transfer Activity, if it is disturbed we can write
			 * revert DB code in Catch Block.
			 * 
			 * Exception is a Super class of all the Exception Class.it is under
			 * java.lang packge exception summary
			 * 
			 * WE can add multiple catch Block here
			 */

			System.out.println("**Catch Clock Atithematic***");

		}

		catch (NullPointerException e) {
			System.out.println("**Catch Clock Atithematic***");

		}

		catch (Exception e) {

			System.out.println("***Catch For Exception");

			/*
			 * when exception is not arithmetic or Null Pointer. It will handle
			 * all type of Exception.
			 * 
			 * we can not put it first because it will never go to other
			 * exception and other code will be unreachable.
			 */}

		System.out.println("End OF Main");
	}

}
