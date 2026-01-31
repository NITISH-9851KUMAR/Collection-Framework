package array;

public class Array1D{

	public static void main(){

		// Declare and define an array: way 1
		int[] arr;
		arr= new int[3];

		// Declare and define an array: way 2
		int[] brr;

		// initialize an array : way 1
		arr[0]= 1;
		arr[1]= 2;
		arr[2]= 3;
		print(arr);

		// initialize an array : way 2
		int[] crr= {1,2,3,4,5,6};
		print(crr);

		// initialize an array : way 3
		// It is generally used with class, and object
		int[] trr= new int[]{12, 80, 32, 90, 12, 33};
		print(trr);

		// initialize an array : way 4
		brr= new int[]{10, 20, 30};
		System.out.print("This is Me: ");
		print(brr);
		//brr= new int[5];


		// invalid syntax 
		//int ar[5]= {100, 99, 88,77, 66};
		//print(arr);
	}

	// print an array
	static void print(int[] arr){
		for(int i: arr)
			System.out.printf("%d ",i);
		System.out.println();
	}

}