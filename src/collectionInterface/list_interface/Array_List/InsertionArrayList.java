package collectionInterface.list_interface.Array_List;

import java.util.List;
import java.util.ArrayList;

public class InsertionArrayList{
	public static void main(String[] args) {
		
		List<Integer> odd= new ArrayList<>();
		odd.add(1);
		odd.add(3);
		odd.add(5);
		odd.add(7);
		odd.add(9);
		// print the odd ArrayList
		System.out.println(odd+"\n");

		// create a Integer type list using odd List
		List<Integer> number= new ArrayList<>(odd);
		// print the number list
		System.out.print(number+"\n");

		// create a even type of list
		List<Integer> even1= new ArrayList<>();
		even1.add(2);
		even1.add(4);
		even1.add(6);
		even1.add(8);
		System.out.print(even1+"\n");

		// add even list into number list
		number.addAll(even1);
		// print finally number list
		System.out.print(number);

		// It will give an error
		// number.add(100, 99); 


	}
}