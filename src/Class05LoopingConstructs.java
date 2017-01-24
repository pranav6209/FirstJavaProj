public class Class05LoopingConstructs {

	public static void main(String[] args) {

		// /////////////////////////////////////////////////////////////////////////////////////

		int i = 0;

		while (i < 5) {

			System.out.println("Hello World While " + i);

			i++;

			// i=i+1
			// if we remove incremental value the loop will excute
			// infinite no of time

		}

		// ////////////////////////////////////////////////////////////////////////////////////////

		int j = 100;

		do {
			System.out.println("Hello world Do While " + j);

		} while (j < 50);

		// //////////////////////////////////////////////////////////////////////////////////////////////

		for (int k = 0; k < 10; k++) {

			if (k == 5) {

				/*
				 * If we want to break at particular condition, use break
				 * statement. It will terminate the loop. Break will Only for
				 * iterative loop. Here break statement will break outer loop as
				 * there is not inner loop(if() is not an iterative loop.)
				 * Writing "break" will break inner iterative loop.
				 */
				break;

				/*
				 * Continue will skip printing when condition met. for k==5
				 * because of continue statement, it will not print.
				 */

				// continue;
			}

			System.out.println("Hello World " + k + "Value of K");
		}

		// /////////////////////////////////////////////////////////////////////////////////////////////////
		/*
		 * Nested loops:
		 * 
		 * Outer loop iterate 5 times and inner loop 15 times labeling loop as
		 * outer.we can also label any line in method.
		 */
		outer: for (int l = 0; l < 5; l++) {

			for (int m = 0; m < 3; m++) {

				if (l == 2) {

					// break statement here breaks inner loop.

					break;

					// break outer will breaks outer loop As it is labeled
					// outer.

					// break outer;

					/*
					 * Second break outer will never excute it is unreachable
					 * code any code after break will be unreachable
					 */

					// break outer;

				}
				//
				// // print will print in same line
				System.out.print("value of M:" + m);
			}
			System.out.println("Value of L:" + l);
		}

		// /////////////////////////////////////////////////////////////////////////////////////////////////

		// Question:1 in class.
		int a = 0;

		for (; a < 4; a += 2) {

			/*
			 * 0 and 2 will print from loop and after that =4 will break the
			 * loop and Print last value.
			 */

			System.out.println("Printing From Inside a Loop:" + a);

		}
		System.out.println("Printing From Outside a Loop:" + a);

		// ////////////////////////////////////////////////////////////////////////////////////////////////////////

		/*
		 * Question:2 b=0 break, b=1 one two three as no break, b=2 two three ,
		 * b=3 switch break and done print
		 */

		for (int b = 0; b < 3; b++) {

			switch (b) {
			case 0:
				break;
			case 1:
				System.out.println("one");
			case 2:
				System.out.println("two");
			case 3:
				System.out.println("three");

			}
		}
		System.out.println("done");

		// /////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// Question : 3
		int c = 1, d = 0;

		switch (c) {

		case 2:
			d += 6;
		case 4:
			d += 1;

			/*
			 * loop will execute only once. with c==1 and d==0. it will hit
			 * default case as case o is not available and increment d value by
			 * 2. so now d==2 and as there is no break statement available it
			 * will increment d value by 4 again and then print d=6
			 */

		default:
			d += 2;
		case 0:
			d += 4;

		}
		System.out.println("d=" + d);
	}
}
