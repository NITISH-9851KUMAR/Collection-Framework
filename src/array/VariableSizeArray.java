package array;

public class VariableSizeArray{
	public static void main(String[] args) {
		
		// Now declares only row with 3 size
		int arr[][]= new int[3][];

		// declare column for 1st row
		arr[0]= new int[3];
		
		// declare column for 2nd row
		arr[1]= new int[4];

		// declare column for 3rd row
		arr[2]= new int[2];

		// initialize value for 1st raw
		arr[0]= new int[]{1, 2, 3};
		//Also below is valid initialize 
		// arr[0][0]= 1;
		// arr[0][1]= 2;
		// arr[0][2]= 3;

		// initialize value for 2nd raw
		arr[1]= new int[]{4, 5, 6, 7};
		//Also below is valid initialize 
		// arr[1][0]= 4;
		// arr[1][1]= 5;
		// arr[1][2]= 6;
		// arr[1][3]= 7;

		// initialize value for 2nd raw
		arr[2]= new int[]{8, 9};
		//Also below is valid initialize 
		// arr[2][0]= 8;
		// arr[2][1]= 9;
		print(arr);


		// with new keyword
		int brr[][]= new int[][]{
			{1, 2},
			{3, 4, 5, 6},
			{9},
			{10, 9, 3, 6}
		};
		print(brr);

// 		it is more recommended
		int crr[][]=
		{
			{1},
			{3, 4, 5, 6, 10},
			{9, 2},
			{}, // with no value means null
			{10, 9, 3, 6}
		};
		print(crr);


	}

	static void print(int arr[][]){
		for(int i= 0; i<arr.length; i++){
			int c= arr[i].length;
			for(int j= 0; j<c; j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		System.out.print("\n");
	}

}