package generic;
public class VarargsMethodArray{

	// with any type
	static <T> void methodTType(T[] arr){
		for(T ele: arr)
			System.out.print(ele+" ");
		System.out.println();
	}

	// only for int type
	static void varargsMethod1(int v[]){
		System.out.print("Number of args: "+v.length+" Elements: ");
		for(int x: v)
			System.out.print(x+" ");
		System.out.println();
	}

	public static void main(String args[]){
		// Following arrays are created for test...
		int x[]= {1, 3, 5, 7};
		int y[]= {2, 4};
		int z[]= {};
		varargsMethod1(x); // Pass 4 parameter
		varargsMethod1(y); // Pass 2 parameter
		varargsMethod1(z); // Pass no parameter

		methodTType(new Integer[]{1, 2, 3});
		methodTType(new String[]{"He", "Ha"});


	}

}
