package vector;

import java.util.Vector;

public class InsertElement{
	public static void main(String[] args) {
		
		Vector<Integer> v= new Vector<>(7);
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(60);
		v.add(70);
		System.out.println("Vector Element: "+v);
		System.out.println("Initial capacity: "+v.capacity());

		v.add(80);
		v.add(90);

		System.out.println("Vector Element: "+v);
		System.out.println("Capacity: "+v.capacity());

		v.insertElementAt(100, 2);

		System.out.println("Vector Element: "+v);
		System.out.println("Vector Capacity: "+v.capacity());	

	}
}