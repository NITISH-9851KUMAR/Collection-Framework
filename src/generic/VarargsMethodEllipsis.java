package generic;
public class VarargsMethodEllipsis{

	static<T> void varargsMethod(T arr[]){
		for(T ele : arr)
			System.out.print(ele+" ");
		System.out.println();
	}

	// Defining a varargs method using ellipsis
	static void varargsMethod(int ... v){
		System.out.print("Number of Arguments: "+v.length+" Element: ");
		for(int i: v)
			System.out.print(i+" ");
		System.out.println();
	}

	public static void main(String args[]){

		// calling the varargs method with variable arguments
		varargsMethod(9);         	  // One parameter
		varargsMethod(1, -2, 3, -4); // Four Parameter
		varargsMethod();            // no parameter

		// Any type
		varargsMethod(new Double[]{22.3, 23.5});
		varargsMethod(new String[]{"a", "b", "c"});

	}
}