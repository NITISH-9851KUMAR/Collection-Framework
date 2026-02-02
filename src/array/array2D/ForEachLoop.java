package array.array2D;

public class ForEachLoop {
    public static void main() {

        int[][] arr =
                {
                        {2, 9, 9, 4},
                        {7, 2, 1, 9},
                        {5, 6, 4, 0}
                };


        for (int[] a : arr) {
            for (int ele : a) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

    }
}
