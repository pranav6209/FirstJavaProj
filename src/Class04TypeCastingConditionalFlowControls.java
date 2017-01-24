public class Class04TypeCastingConditionalFlowControls {

	public static void main(String[] args) {

		/*
		 * Type Casting
		 * 
		 * 1. Implicit Conversions 2. Explicit Conversions
		 * 
		 * Casting operator -> ().
		 * 
		 * int = (int)other data variable or direct value
		 */

		// Implicit Conversion..
		// byte ---> int possible because there is no loss of data and byte
		// value is possible to store in to int.
		// This is an implicit type conversion. where no need of Syntax.
		// system will take care of it automatically

		byte b = 100;

		int i = b;

		System.out.println("Implicit Casting " + i);

		// //////////////////////////////////////////////////////////////////////////////////////////
		// explicit conversion..
		// int---> byte not possible loss of data. so complier do not accept.

		float price = 9.99f;

		int j = (int) price;

		System.out.println("Explicit Casting " + j);

		// //////////////////////////////////////////////////////////////////////////////////////////////

		/*
		 * inside if(), condition should be always condition(boolean). 
		 * Price >10. the result will be yes.
		 * logic is missing a==b. if condition fails it will still execute else
		 * block in case of a==b
		 */

		if (price > 10) {

			System.out.println("price is more then 10");
		}

		// //////////////////////////////////////////////////////////////////////////////////////////////////
		int a = 40, c = 12;

		if (a > c) {

			System.out.println("a is greater");

		} else {

			System.out.println("c is greater");

		}
		//
		// ///////////////////////////////////////////////////////////////////////////////////////////////////

		if (a > b) {

			System.out.println("a is greater");

		} else if (b > a) {

			System.out.println("b is greater");
		} else {

			System.out.println("a & b are equals");
		}

		// /////////////////////////////////////////////////////////////////////////////////////////////////////

		/* 
		 * If we remove break statement after a case, next case will execute.
		 * Logically don't need break statement after last case as there is not a next case to execute.
		 */

		switch (a) {

		case 10:

			System.out.println("a value is 10");

			break;

		case 20:
			System.out.println("a value is 20");

			break;

		case 30:
			System.out.println("a value is 30");

			break;

		default:
			
		}

		// add character example from recorded session. After one hr of class.
		// /////////////////////////////////////////////////////////////////////////////////////////////////////////
	}
}
