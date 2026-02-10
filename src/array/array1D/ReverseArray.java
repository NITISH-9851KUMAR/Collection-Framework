package array.array1D;

public class ReverseArray {
    public static void main(){

        int[] arr = {1, 5, 7, 8, -3, 9, 20, 83};
        System.out.println("Before Reverse");
        PrintArray.printArray(arr);
        int i= 0;
        int j= arr.length-1;
        while(i<j){
            int temp= arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
        System.out.println("After Reverse");
        PrintArray.printArray(arr);

    }

}
