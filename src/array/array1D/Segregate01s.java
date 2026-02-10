package array.array1D;

import java.util.Arrays;

public class Segregate01s {
    public static void main(){

        int[] arr= {0, 0, 0, 1, 0};
        //        print like this: 0 0 0 0 1, first 0s and second 1s
        int count0s= 0;
        for(int ele: arr){
            if(ele==0) count0s++;
        }
        for(int i= 0; i<count0s; i++){
            arr[i]= 0;
        }
        for(int i= count0s; i<arr.length; i++){
            arr[i]= 1;
        }
        System.out.println(Arrays.toString(arr) );
    }
}