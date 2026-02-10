package array.array1D;

import java.util.Arrays;

public class WaveArray {
    public static void main() {
        int[] arr = {2, 4, 7, 8, 9};
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int temp = arr[i];
            if(i+1!=n){
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            i += 2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
