package array.array2D;

public class MatrixMul {
    public static void main() {

        int[][] arr1 = {
                {2, 1, 3, 3}
        };
        int[][] arr2 = {
                {4, 2},
                {5, 6},
                {1, 2},
                {3, 4}
        };

        int firstCol = arr1[0].length;
        int secondRow = arr2.length;

        if (firstCol != secondRow) {
            System.out.println("Matrix Multiplication is not Possible");
            return;
        }

        // result matrix
        int[][] resultMat = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr2[0].length; j++) {
                for (int k = 0; k < arr2.length; k++) {
                    sum += arr1[i][k] * arr2[k][j];
                }
                resultMat[i][j] = sum;
                sum = 0;
            }
        }

        PrintArray.printArray(resultMat);
    }
}
