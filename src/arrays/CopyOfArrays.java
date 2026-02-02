package arrays;

import java.util.Arrays;

public class CopyOfArrays{
	public static void main() {
		
		int[] intArr= {10, 20, 15, 22, 35}; // An input array
		// To print the elements in one line

		// it is simple copy
		int[] copyArr= Arrays.copyOf(intArr, 10);
		// It creates a new array with 10 length and copy all element from intArr
		System.out.println(Arrays.toString(copyArr));

		// Copy element between range
		int[] copyArr2= Arrays.copyOfRange(intArr, 1, 4);
		System.out.println(Arrays.toString(copyArr2));

	}
}