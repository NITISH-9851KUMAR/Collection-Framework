package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {

        Integer[] arr = {40, 10, 30};

        Arrays.sort(arr, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        });
        System.out.println(Arrays.toString(arr));

    }
}
