package array.array1D;

public class Max2ndElement {
    public static void main() {

        int[] arr = {1, 5, 8, 8, -3, 9, 20, 83};
        int max1st = Integer.MIN_VALUE;
        int max2nd = Integer.MIN_VALUE;

//        Only using One loop
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max1st) {
//                max2nd= max1st;
//                max1st = arr[i];
//
//            }
//        }

//        Using 2 loop
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1st) {
                max1st = arr[i];

            }
        }
        System.out.printf("First Maximum Element: %d\n", max1st);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max1st) continue;
            if (arr[i] > max2nd) max2nd = arr[i];
        }
        System.out.printf("First Maximum Element: %d", max2nd);
    }
}
