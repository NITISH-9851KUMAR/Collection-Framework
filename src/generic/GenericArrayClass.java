package generic;
public class GenericArrayClass<T>{

	private T val[];


	// Declare Constructor
	GenericArrayClass(T val[]){
		this.val= val;
	}

	// Show the value
	void printData(){
		for(T x: val)
			System.out.print(x+" ");
		System.out.println();
	}

	// Reverse Array
	void reverseArray(){
		T temp; int i= 0, j= val.length-1;
		while(i<=j){
			temp= val[i];
			val[i]= val[j];
			val[j]= temp;
			i++;
			j--;
		}
	}

	// Main Method
	public static void main(String args[]){

		// Integer Type
		System.out.println("Integer Type");
		Integer arr[]= {1, 2, 3, 4, 5, 6};
		GenericArrayClass<Integer> aInt= new GenericArrayClass<>(arr);
		aInt.printData();
		aInt.reverseArray();
		aInt.printData();
		System.out.println();

		// Double Type
		System.out.println("Floating Type");
		GenericArrayClass<Double> aDou= new GenericArrayClass<>(new Double[]{1.2, 2.1, 3.4, 9.2});
		aDou.printData();
		aDou.reverseArray();
		aDou.printData();
		System.out.println();

		// String Type
		System.out.println("String Type");
		GenericArrayClass<String> aStr= new GenericArrayClass<>(new String[]{"ab", "bc", "cd", "de", "ef"});
		aStr.printData();
		aStr.reverseArray();
		aStr.printData();
	}

}