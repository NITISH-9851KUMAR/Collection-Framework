package vector;

import java.util.*;

public class VectorSearch{
	public static void main(String[] args) {
		
		Vector<Object> v= new Vector<>();
		v.add(1);
		v.add(2);
		v.add("C++");
		v.add("Python");
		v.add(3);

		// check whether vector contains "Java"
		if(v.contains("Java"))
			System.out.println("The element exists");
		else 
			System.out.println("The element does not exists");

	}
}