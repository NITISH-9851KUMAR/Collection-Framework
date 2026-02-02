/** Transpose of Matrix */
package array.array2D;

public class TransposeMatrix {
    public static void main(String[] args) {

        int[][] arr =
                {
                        {2, 3, 9, 4},
                        {7, 2, 1, 9},
                        {5, 6, 4, 0},
                        {2, 8, 9, 1}
                };

        PrintArray.printArray(arr);

        for(int i= 0; i<arr.length; i++){
            for(int j= i+1; j<arr[i].length; j++){
                // swap the value
                if(i!=j){
                    int swap= arr[i][j];
                    arr[i][j]= arr[j][i];
                    arr[j][i]= swap;
                }

            }
        }
        System.out.println("After Swap Value");
        PrintArray.printArray(arr);


    }
}
