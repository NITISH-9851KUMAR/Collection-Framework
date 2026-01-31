package arrays;

import java.util.Arrays;

public class SortArrays{
	public static void main(String[] args) {

		char[] ch= {'a', 'l', 'c', 'p', 'n', 'b'};
		System.out.println("Before Sort: "+Arrays.toString(ch));

		// call the sort method to sort the array
		// Arrays.sort(ch);
		System.out.println("After Sort: "+Arrays.toString(ch));

		// sort between range
		// Arrays.sort(ch, 0, 3);
		System.out.println("After Sort: "+Arrays.toString(ch));

		// parallel sort method, is better then sort for large set of data
		Arrays.parallelSort(ch);
		System.out.println("After Sort: "+Arrays.toString(ch));
		
		
	}
}