package array.array1D;

public class SortArray {
    public static void main(){
        int[] arr= {1, 5, 9, 4, -2, 8, 3};
        System.out.print("Before Sort Array:    ");
        PrintArray.printArray(arr);

        for(int i= 0; i<arr.length; i++){
            for(int j= i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp= arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }
            }
        }
        System.out.print("After Sorting Array: ");
        PrintArray.printArray(arr);
    }

}
