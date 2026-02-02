/** Print elements of 2D array column-wise */

package array.array2D;

public class PrintColWise {
    public static void main() {

        int[][] arr =
                {
                        {2, 9, 9, 4},
                        {7, 2, 1, 9},
                        {5, 6, 4, 0},
                        {3, 9, 8, 2},
                        {1, 1, 1, 1}
                };

        for(int j= 0;j<arr[0].length;j++){
            for(int i= 0;i<arr.length; i++){
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }

    }
}
