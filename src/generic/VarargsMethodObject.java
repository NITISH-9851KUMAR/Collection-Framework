package generic;
public class VarargsMethodObject{

	// Defining a varargs method using ellipsis
	static void varargsMethod(Object ... obj){
		System.out.print("Number of Arguments: "+obj.length+" Element: ");
		for(Object i: obj)
			System.out.print(i+" ");
		System.out.println();
	}

	public static void main(String args[]){

		varargsMethod("Hello");         	  // One parameter
		varargsMethod(1, "Java", 3.33, true);// Four Parameter
		varargsMethod();                    // no parameter
		varargsMethod(1, 2, 4, 5, 8, 3);   // six parameter

	}
}