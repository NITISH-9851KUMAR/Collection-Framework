package arrays;

import java.util.*;

public class ArraysToStream{
	public static void main(String[] args) {
		
		// Get the array
		int[] arr= {10, 20, 15, 22, 35};

		// To get the Stream from the array
		int sum= Arrays.stream(arr).sum();
		System.out.println(sum);

	}
}