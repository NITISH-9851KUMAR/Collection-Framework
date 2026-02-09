package array.array1D;

public class ProductOfArr {
    public static void main() {
        int[] arr = {1, 3, 2, 5, 4};

        int prod= 1;
        for(int ele: arr){
            prod *= ele;
        }
        System.out.printf("Product of Array: %d",prod);
    }

}
