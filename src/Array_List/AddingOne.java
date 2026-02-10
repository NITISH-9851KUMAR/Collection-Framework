package Array_List;

import java.util.Vector;

public class AddingOne {
    public static void main() {

//        Input: arr[] = [5, 6, 7, 8]
//        Output: [5, 6, 7, 9]
//        Explanation: 5678 + 1 = 5679
        int[] arr = {5, 6, 7, 8};
        Vector<Integer> list= new Vector<>();
        int n= arr.length-1;
        if(arr[n]!=9) arr[n]++;
    }
}
