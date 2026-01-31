package array;

import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main() {
        int[] arr= {10, 20, 30, 40};

        // shallow copy changed into original array
        int[] x= arr; // x is shallow copy of arr, means x is point to the original arr
        x[0]= 100; // also change into original arr
        System.out.println(arr[0]);
        System.out.println(x[0]);

//      deep copy doesn't change into original array, it creates another own copy
        int[] deep= Arrays.copyOf(arr, arr.length);
        deep[2]= 29; // it will not change into original array
        System.out.println(deep[2]);
        System.out.println(arr[2]);

    }
}
