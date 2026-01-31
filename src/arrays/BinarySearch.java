package arrays;

import java.util.Arrays;

public class BinarySearch{
	public static void main(String[] args) {
		
		int intArr[]= {10, 20, 15, 22, 35};
		System.out.println("Before Sort: "+Arrays.toString(intArr));

		// sort the array
		Arrays.sort(intArr);
		System.out.println("After Sort: "+Arrays.toString(intArr));
    
    	// Binary Search
    	int intKey= 22;
    	int idx1= Arrays.binarySearch(intArr, intKey);
    	System.out.println(intKey+" found at index : "+idx1);

    	// find element within the range 
    	int idx2= Arrays.binarySearch(intArr, 1, 3,intKey);
    	if(idx2<0) System.out.println("Not Found within in Range");
    	else System.out.println(intKey+" found at index : "+idx2);

	}
}