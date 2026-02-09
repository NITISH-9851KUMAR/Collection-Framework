package array.array1D;

public class Sum {
    public static void main(){

        int[] arr = {10, 20, 30, 40, 50, 60};
        int sum= 0;
        for(int ele: arr){
            sum += ele;
        }
        System.out.printf("Sum of Element: %d",sum);

    }
}
