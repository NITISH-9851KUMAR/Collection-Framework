package vector;

import java.util.Vector;

public class CloneVector{
	public static void main(String[] args) {
		
		Vector<Object> v= new Vector<>();
		v.add(1);
		v.add(2);
		v.add("C++");
		v.add("Python");
		v.add(3);
		System.out.println("Vector: "+v);

		Vector<Object> v_clone= new Vector<>(v);   

		System.out.println("Clone Vector: "+v_clone);

	}
}