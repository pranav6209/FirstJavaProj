import java.lang.reflect.Array;

public class Class07Arrays {

	/*
	 * To hold group of similar value.Variable can store one value but to store
	 * more value array is used.
	 */
	public static void main(String[] args) {

		// /////////////////////////////////////////////////////////////////////////////////////////////

		/*
		 * square bracket after data type is array. a is name of array.asking
		 * jvm to allocate memory to array to store 5 int value.jvm will
		 * allocate block of memory and it will divide in to 5 parts.Each part
		 * called cell and each part will have index starts with 0
		 */

		int[] arr = new int[5];

		arr[0] = 11;
		arr[1] = 34;
		arr[2] = 56;
		arr[3] = 10;
		arr[4] = 20;

		// for auto loop ctrl+space i<5 basically arr.5

		for (int i = 0; i < arr.length; i++)

		{
			System.out.println(arr[i]);

		}

		// // if want to iterate 3 times

		/*
		 * for (int i = 0; i < 3; i++) { System.out.println(arr[i]); }
		 */

		// // iterating with while loop.

		/*
		 * int i = 0;
		 * 
		 * while (i < arr.length) {
		 * 
		 * System.out.println(arr[i]);
		 * 
		 * i++; }
		 */

		/*
		 * for each can be used to read each elements from collection and array
		 * 
		 * Automatically iterate based on no of element
		 * 
		 * syntax:
		 * 
		 * for(declare a temp variable of type array : array-ref/array-name){
		 * stms
		 * 
		 * } no use of each.
		 * 
		 * for each iteration it will take value and store in temp variable i
		 */

		/*
		 * for (int i : arr) { System.out.println(i);
		 * 
		 * }
		 */

		// // char array.
		//
		// char[] ch = { 'H', 'E', 'L', 'L', 'O' };
		//
		// for (char c : ch) {
		//
		// System.out.print(c);
		// }
		// ///////////////////////////////////////////////////////////////////////////////

		// Array of array main array of three which hold sub array of 2. see pic
		// for more details.

		/*
		 * int[][] arr = new int[3][2];
		 * 
		 * arr[0][0] = 11; arr[0][1] = 14; arr[1][0] = 55; arr[1][1] = 33;
		 * arr[2][0] = 12; arr[2][1] = 56;
		 * 
		 * // arr.legnth main array 3
		 * 
		 * for (int i = 0; i < arr.length; i++) {
		 * 
		 * // nested loop iterate 2 times
		 * 
		 * for (int j = 0; j < arr[i].length; j++) {
		 * 
		 * System.out.print(arr[i][j] + " ");
		 * 
		 * } System.out.println();
		 * 
		 * }
		 */

	}
}
