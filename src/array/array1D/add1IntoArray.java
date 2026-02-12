package array.array1D;

import java.util.ArrayList;
import java.util.Arrays;

public class add1IntoArray {
    public static void main(){

//        Define two array with different size and add both
        int[] arr = {1,2,9,4,5}; // add 1 in the array
//        result array 1, 2, 9, 4, 6
        ArrayList<Integer> list= new ArrayList<>();
        int carry= 1;
        int n= arr.length;
//        It adds 1 into list array from last index to first index of digits
        for(int i=n-1; i>=0; i--){
            if(arr[i]+carry<=9){
                list.add(arr[i]+carry);
                carry= 0;
            }else{
                list.add(0);
                carry= 1;
            }
        }
        if(carry==1) list.add(1);

        n= list.size();
        int[] ans= new int[n];
        int j= 0;
//        It stores result array, in list, answer are store into reverse order
        for(int i= n-1;i>=0; i--){
            ans[j]= list.get(i);
            j++;
        }
        System.out.println(Arrays.toString(ans));

    }
}
