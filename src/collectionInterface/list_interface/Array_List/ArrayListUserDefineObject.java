package collectionInterface.list_interface.Array_List;

import java.util.ArrayList;

public class ArrayListUserDefineObject{
	public static void main(String[] args) {
		// Declaring pList as a collection of type Person of capacity 5
		ArrayList<Person> pList= new ArrayList<>(5);

		Person p1= new Person("Ram", 25);
		pList.add(p1);
		pList.add(new Person("Sita",22));
		pList.add(new Person("John",34));
		pList.add(new Person("Rahim", 29));
		pList.add(new Person("Lilly", 24));

		//No issue to accommodate, list grows dynamically
		pList.add(new Person("Laila", 30));


		// using for each loop
		// for(Person p : pList){
		// 	p.printData();
		// }

		// simple way: An way to access each object in a class
		pList.forEach(p->p.printData());
		System.out.print("\n\n");
		// Another way to print
		pList.forEach(Person::printData);

	}
}