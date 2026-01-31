package array;

public class PassingArrayToMethods {
    public static void main() {
        int[] arr= {10, 3, 29, 38};
        System.out.println(arr[2]);
        change(arr);
        System.out.println(arr[2]);
    }
// It is pass by reference
    public static void change(int[] arr) {
        arr[2]= 30;
    }

}
