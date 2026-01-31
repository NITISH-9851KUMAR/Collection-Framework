package vector;

import java.util.Vector;

public class DeletionOperation{
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

		// Remove a particular Element
		v.removeElement(20);
		System.out.println("After removeElement 20: "+v);

		// Remove from a particular index
		v.removeElementAt(4);
		System.out.println("After Index Remove on 4th(60): "+v);

// 		Also use clear instread of removeAllElements
		v.removeAllElements();
		System.out.println("Vector Element After Clear: "+v);

	}
}