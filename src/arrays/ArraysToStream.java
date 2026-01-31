package arrays;

import java.util.*;

public class ArraysToStream{
	public static void main(String[] args) {
		
		// Get the array
		int intArr[]= {10, 20, 15, 22, 35};
		// To get the Stream from the array
		System.out.print("Integer Array: "+Arrays.stream(intArr));
		System.out.print(Arrays.toString(intArr));

		String arr= Arrays.toString(intArr);

	}
}