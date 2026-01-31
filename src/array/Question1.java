/**
 * Multiply odd indexed elements by 2 and add 10 to even indexed elements
 */

package array;

public class Question1 {
    public static void main() {
        int[] arr = {10, 20, 30, 40, 50, 60};
        PrintArray.printArray(arr);

//         odd*2 even+10
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] += 10;
            } else arr[i] *= 2;
        }
        PrintArray.printArray(arr);
    }

}
