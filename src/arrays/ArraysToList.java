package arrays;

import java.util.*;

public class ArraysToList{
	public static void main() {
		
		String[] arr= {"Me", "as", "You", "Ya"};
		List<String> list= Arrays.asList(arr);
		// cannot add or remove from list
		System.out.println(list);
//
		int[] intArr= {1, 2, 3,5 ,6};
		List<Integer> list1= Arrays.stream(intArr).boxed().toList();
		System.out.println(list1);


	}
}