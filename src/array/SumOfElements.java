package array;

public class SumOfElements {
    public static void main() {

        int[] arr= {9, 4, 5, 7, 6, 2, 4};
        int sum=0, product= 1;

        for(int i: arr){
            sum += i;
            product *= i;
        }
        System.out.printf("Sum of Element: %d",sum);
        System.out.printf("Product of Element: %d",product);

    }
}
