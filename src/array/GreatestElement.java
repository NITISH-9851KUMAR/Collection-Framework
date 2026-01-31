package array;

public class GreatestElement {
    public static void main() {

        int[] arr = {-6, 8, 14, 23, 47, -10, 3, 10};
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // for max value
            if (max < arr[i]) max = arr[i];

            // for min value
            if (arr[i] < min) min = arr[i];
        }
        System.out.printf("Greatest Element: %d\n", max);
        System.out.printf("Smallest Element: %d", min);

    }
}
