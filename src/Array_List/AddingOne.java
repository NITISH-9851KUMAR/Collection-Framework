package Array_List;

import java.util.Collections;
import java.util.Vector;

public class AddingOne {
    public static void main() {

//        Input: arr[] = [5, 6, 7, 8]
//        Output: [5, 6, 7, 9]
//        Explanation: 5678 + 1 = 5679
//        int[] arr = {5, 6, 7, 8};
        int[] arr = {9,9,9};
        Vector<Integer> list= new Vector<>();
        int n= arr.length;
        int carry= 1;
        for(int i= n-1; i>=0; i--){
            if(arr[i]+carry<=9){
                list.add(arr[i]+carry);
                carry= 0;
            }else{
                list.add(0);
                carry=1 ;
            }
        }
        if(carry==1) list.add(1);
        Collections.reverse(list);
        System.out.println(list);


    }
}
