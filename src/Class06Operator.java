public class Class06Operator {

	public static void main(String[] args) {

		int i = 10;
		/*
		 * Expression will go from left to right.Pre Increment(increment first
		 * then Print): ++i and Post Increment :i++
		 */
		// initial i=10 but it will post increment by 1 so after that i will be
		// 11.
		System.out.println(i++);
		// here i =11 and ++i will pre-increment so it will print 12.
		System.out.println(++i);
		// here i=12 and it will post increment by 1. So, after executing this
		// statement i=13
		System.out.println(i++);

		System.out.println(i);
		// //////////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println();

		int j = 1, k = 10;
		do {

			/*
			 * for first iteration 1 > 9 so no loop second iteration 2 > 8 so no
			 * loop third iteration 3 > 7 fourth iteration 4 >6
			 */

			if (j++ > --k) {

				continue;

			}
		}

	/*	 for first iteration 2 <5.
		 second iteration 3<5
		 third iteration 4<5
		 fourth iteration 5 < 5*/
		while (j < 5);

		/*
		 * 5<5 is not true and it will break loop. when j = 5 and k = 6 it will
		 * break loop and it will print i=13 already from above increments.
		 */
		System.out.println("i=" + i + "and k=" + k);

		// //////////////////////////////////////////////////////////////////////////////////////////////////////////
	}

}
