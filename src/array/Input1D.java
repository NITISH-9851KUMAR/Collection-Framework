package array;

import java.util.Scanner;

public class Input1D {
    public static void main() {
        Scanner sc= new Scanner(System.in);
        int[] arr= new int[10];

        System.out.print("Enter Value: ");
        for(int i= 0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }

        PrintArray.printArray(arr);
    }

}
