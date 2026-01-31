 package collectionInterface.list_interface.Array_List;

 import java.util.ArrayList;
 import java.util.List;

 public class CreateArrayListFromCollection{

 	public static void main(String[] args) {
 	
 		List<Integer> aList= new ArrayList<>();
 		aList.add(2);
 		aList.add(3);
 		aList.add(5);
 		aList.add(7);
 		aList.add(11);
 		System.out.println(aList);

 		// Creating another collection initially with aList collection
 		ArrayList<Integer> number= new ArrayList<>(aList);
 		number.add(13);
 		number.add(17);
 		System.out.print(number);

 	}

 }