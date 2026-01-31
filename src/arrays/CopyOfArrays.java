package arrays;

import java.util.Arrays;

public class CopyOfArrays{
	public static void main(String[] args) {
		
		int intArr[]= {10, 20, 15, 22, 35}; // An input array
		// To print the elements in one line
		System.out.println("Integer Array: "+Arrays.toString(intArr));
		System.out.println("\nNew Arrays by copyOf: \n");
		System.out.println("Integer Array: "+Arrays.toString(Arrays.copyOf(intArr, 10)));

	}
}