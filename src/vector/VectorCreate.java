package vector;

import java.util.ArrayList;
import java.util.Vector;

public class VectorCreate{
	public static void main(String[] args) {
		
		// Vector<Object> v= new Vector<>(); // create a vector of default size 10
		Vector v= new Vector();
		v.add(1);
		v.add(2);
		v.add("Debasis");
		v.add(3.4);
		v.add("Samanta");
		System.out.print("Vector is "+v);


	}
}