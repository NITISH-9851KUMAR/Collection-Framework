package arrays;

import java.util.Arrays;

public class ToFillArrays{
	public static void main(String[] args) {
		
		int[] arr= {10, 20, 15, 22, 90};
		int intKey= 17;

		// fill 17 to all index in arr 
		Arrays.fill(arr, intKey);

		System.out.println(Arrays.toString(arr));

	}
}