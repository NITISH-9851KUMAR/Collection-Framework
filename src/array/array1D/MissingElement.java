package array.array1D;

public class MissingElement {

    public static void main() {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};

        int n= arr.length+1;
        long lengthSum= n*(n+1)/2;

        int arrSum= 0;
        for(int ele: arr){
            arrSum += ele;
        }
        System.out.println(lengthSum-arrSum);
    }

}
