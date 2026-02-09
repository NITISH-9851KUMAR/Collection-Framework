package array.array1D;

public class RotateArray {
    public static void main() {

//        int[] nums= {1, 2, 3, 4, 5, 6, 7};
//        int d= 3
//        Output : 5, 6, 7, 1, 2, 3, 4

        int[] nums = {-1, -100, 3, 99};
        int k = 2;
        int n = nums.length;
        k %= n;

//        Step1: Reverse all array
//        7, 6, 5, 4, 3, 2, 1
//        Step 2: Reverse 0 to d-1
//        5, 6, 7, 4, 3, 2, 1
//        Step 3: Reverse d to length-1

        reverseArray(0, n - 1, nums);
        reverseArray(0, k - 1, nums);
        reverseArray(k, n - 1, nums);
        PrintArray.printArray(nums);

    }

    static void reverseArray(int i, int j, int[] arr) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

}
