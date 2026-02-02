package arrays;

import java.util.Arrays;

public class BinarySearch{
	public static void main() {

		int[] arr = {10, 90, 15, 14, 35, 76, 4, 26}; // An input array

		// Binary Search is only apply on sorted array
		Arrays.sort(arr);

		// It returns the index of key value
		int val= Arrays.binarySearch(arr, 30);
		System.out.println("Found At: "+val);
		val= Arrays.binarySearch(arr, 35);
		System.out.println("Found At: "+ val);

	}
}