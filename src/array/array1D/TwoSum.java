package array.array1D;

public class TwoSum {
    public static void main(){

        int[] arr= {1, 5, 8, -3};
        int target= 2;
        for(int i= 0; i<arr.length; i++){
            for(int j= i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    System.out.printf("Two Element: %d %d", arr[i], arr[j]);
                    return;
                }
            }
        }
        System.out.println("Not Possible");

    }
}
