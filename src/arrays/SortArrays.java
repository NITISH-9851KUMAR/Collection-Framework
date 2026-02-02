package arrays;

import java.util.Arrays;

public class SortArrays{
	public static void main() {

		int[] arr= {1, 5, 9, 4, 8, 3};
		System.out.printf("Before Sort %s \n", Arrays.toString(arr));

		Arrays.sort(arr);

		System.out.printf("After Sort %s ", Arrays.toString(arr));
		
	}
}