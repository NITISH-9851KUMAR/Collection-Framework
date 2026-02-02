/**
 * Find the row with maximum sum
 */
package array.array2D;

public class RowMaxSum {
    public static void main() {

        int[][] arr =
                {
                        {2, 9, 9, 4, 7},
                        {7, 2, 1, 9, 3},
                        {5, 6, 4, 0, 4},
                        {3, 9, 8, 2, 6},
                        {3, 9, 8, 2, 8}
                };

        int maxSum = Integer.MIN_VALUE;
        int idx = 0;
        // calculate the sum of each row and store into sumArr array
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if (maxSum < sum) {
                maxSum= sum;
                idx = i;
            }
        }
        System.out.println("Maximum Row: "+idx+ " With Value:"+maxSum);


    }
}
