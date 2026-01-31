package arrays;

import java.util.Arrays;

public class RangeCopyArrays{
	public static void main(String[] args) {
		
		int intArr[]= {10, 20, 15, 22, 35};
		// To print the elements in one line
		System.out.println("Integer Array: "+Arrays.toString(intArr));
		System.out.println("\nNew Arrays by compyOfRange:\n");
		// To copy the array into an array of new length
		System.out.println("Integer Array: "+Arrays.toString(Arrays.copyOfRange(intArr, 1, 3)));

		int[] arr= Arrays.copyOfRange(intArr, 0, 3);
		System.out.println(Arrays.toString(arr));

	}
}