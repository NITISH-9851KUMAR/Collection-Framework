package array.array1D;

public class MaxElement {
    public static void main(){

        int[] arr = {10, 20, 93, 40, 50, 60};
        int max= Integer.MIN_VALUE;
        for(int ele: arr){
            if(ele>max) max= ele;
        }

        System.out.printf("Maximum Element in the Array: %d",max);
    }
}
