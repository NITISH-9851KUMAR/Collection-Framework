package array.array1D;

import java.util.Arrays;

public class Merge2Array {
    public static void main() {
//        First array (size 3)
        int[] a = {1, 4, 7};
//         Second array (size 5)
        int[] b = {2, 3, 6, 6, 10};
        int[] r = new int[a.length + b.length];

//        Call first method
//        merge1(a,b, r);
//        System.out.println(Arrays.toString(r));

//        Call 2nd method
//        merge2(a, b, r);
//        System.out.println(Arrays.toString(r));

//        Call 3rd method
        merge3(a, b, r);
        System.out.println(Arrays.toString(r));
    }

    // This method merge sorted array into reverse order
    private static void merge3(int[] a, int[] b, int[] r) {
        int i = a.length - 1, j = b.length - 1, k = r.length - 1;
        while (i !=-1 && j !=-1) {
            if (a[i] > b[j]) r[k--] = a[i--];
            else r[k--] = b[j--];
        }
        while (i != -1) {
            r[k--] = a[i--];
        }
        while (j != -1) {
            r[k--] = b[j--];
        }
    }

    //    Method 1st to merge array
    static void merge1(int[] a, int[] b, int[] result) {
        //      Sort 1st array to 2nd array , store into result array sorted element
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] > b[j]) {
                    int temp = a[i];
                    a[i] = b[j];
                    result[i] = b[j];
                    b[j] = temp;
                } else {
                    result[i] = a[i];
                }
            }
        }

//        Sort 2nd array and store into result array
        int lArr1 = a.length;
        for (int i = 0; i < b.length; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (b[i] > b[j]) {
                    int temp = b[i];
                    b[i] = b[j];
                    result[lArr1] = b[j];
                    b[j] = temp;
                } else {
                    result[lArr1] = b[i];
                }
            }
            if (i == b.length - 1) {
                result[lArr1] = b[i];
            }
            if (lArr1 <= result.length - 1) {
                lArr1++;
            }

        }
    }

    //    Method 2nd
    static void merge2(int[] a, int[] b, int[] r) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j])
                r[k++] = a[i++];
            else
                r[k++] = b[j++];
        }

        // a ka array khatam -> b ko rest value r me dalo
        while (j != b.length) r[k++] = b[j++];

        // b ka array khatam -> a ko rest value r me dalo
        while (i != a.length) r[k++] = a[i++];
    }


}
