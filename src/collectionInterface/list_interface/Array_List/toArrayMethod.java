package collectionInterface.list_interface.Array_List;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class toArrayMethod{
	public static void main(String[] args) {
		
		ArrayList<Integer> a1= new ArrayList<>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		System.out.print(a1+"\n");

		// Get the array
		
		Integer arr[]= new Integer[a1.size()];
		arr= a1.toArray(arr);

		// Object[] ai= a1.toArray(); Alternatively
		for(int i:arr){
			System.out.print(i+" ");
		}

	}
}