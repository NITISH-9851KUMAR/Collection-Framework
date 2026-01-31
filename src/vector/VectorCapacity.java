package vector;

import java.util.Vector;

public class VectorCapacity{
	public static void main(String[] args) {
		
		// initial size is 3, increment is 2
		Vector<Object> v= new Vector<>(3, 2);
		System.out.println("Initial Size: "+v.size());
		System.out.println("Initial Capacity: "+v.capacity());

		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(30);
		v.addElement(30);

		System.out.println("Size: "+v.size());
		System.out.println("capacity: "+v.capacity());
		System.out.println("first Element: "+v.firstElement());

	}
}