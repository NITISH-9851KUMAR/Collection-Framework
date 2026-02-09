package array.array1D;

public class MinElement {
    public static void main(){

        int[] arr = {10, 20, 5, -4, 50, 60};
        int min= Integer.MAX_VALUE;
        for(int ele: arr){
            if(ele<min) min= ele;
        }

        System.out.printf("Maximum Element in the Array: %d",min);
    }
}
