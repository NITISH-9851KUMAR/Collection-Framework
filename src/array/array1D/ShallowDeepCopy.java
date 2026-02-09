package array.array1D;

import java.util.Arrays;

public class ShallowDeepCopy {
    public static void main() {
        int[] arr= {10, 20, 30, 40};

//        It is shallow copy it is another array buts it also points to the original array
//        If we changed into shallow array it also change into original array
        int[] shallowArr= arr;
        System.out.printf("Original Array: %d", arr[3]);
        shallowArr[1]= 25;
        System.out.printf("Shallow Copy: %d",arr[1]);

//        Deep Copy, it is another array it doesn't point the original array
//        It creates another copy, if we changed value , then original array will be not changed
        int[] deepArr= Arrays.copyOf(arr, arr.length);
        deepArr[0]= 4;
        System.out.println(deepArr[0]);
        System.out.println(arr[0]);

    }
}
