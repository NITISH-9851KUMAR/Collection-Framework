package question;

import array.array1D.PrintArray;

public class RotateArr {
    public static void main() {

//        Input: nums = [1,2,3,4,5,6,7], k = 3
//        Output: [5,6,7,1,2,3,4]

//        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] nums = {-1,-100,3,99};
        PrintArray.printArray(nums);

        int k = 3;
        for(int i= 0; i<2; i++){
            int lastElement = 0;
            for (int j = nums.length - 1; j > -1; j--) {
                if (j == nums.length - 1) {
                    lastElement = nums[j];
                }
                if (j - 1 != -1) {
                    nums[j] = nums[j - 1];
                }
                if (j == 0) {
                    nums[j] = lastElement;
                }
            }
        }
        PrintArray.printArray(nums);

    }
}
