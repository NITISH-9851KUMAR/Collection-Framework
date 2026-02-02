package array.array2D;

import java.util.Scanner;

public class Input {
    public static void main() {
        Scanner sc= new Scanner(System.in);
        int[][] arr= new int[3][4];
        // taking input
        System.out.println("Enter Element of Array");
        for(int i= 0; i<arr.length; i++){
            for(int j= 0; j<arr[i].length; j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("Array Element");
        PrintArray.printArray(arr);
    }
}
