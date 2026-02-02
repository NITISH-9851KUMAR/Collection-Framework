/**
 * Print Matrix in Snake Pattern
 */
package array.array2D;

public class SnakePattern {
    public static void main() {

        int[][] arr =
                {
                        {2, 9, 9, 4},
                        {7, 2, 1, 9},
                        {5, 6, 4, 0}
                };
        // snake patter-> 2 9 9 4, 9 1 2 7, 5 6 4 0
        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0)
                for (int j = 0; j < arr[i].length; j++)
                    System.out.printf("%d ", arr[i][j]);
            else
                for (int k = arr[i].length - 1; k >= 0; k--)
                    System.out.printf("%d ", arr[i][k]);
        }

    }
}
