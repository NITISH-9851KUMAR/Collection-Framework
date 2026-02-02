package array.array2D;

public class Sum {
    public static void main() {

        int[][] arr1= {
                {1, 2, 3, 4},
                {3, 4, 5, 6},
                {3, 3, 5, 9}
        };

        int[][] arr2= {
                {1, 2, 3, 4},
                {3, 6, 5, 6},
                {3, 3, 5, 9}
        };

        if(arr1.length!=arr2.length){
            System.out.println("Sum of Array is Not Possible , Order is not match");
            return;
        }
        int[][] sum= new int[3][4];

        PrintArray.printArray(arr1);
        System.out.println("    +");
        PrintArray.printArray(arr2);
        System.out.println("    =");

        for(int i= 0; i< arr1.length; i++){
            for(int j= 0; j<arr1[i].length; j++){
                sum[i][j] = arr1[i][j]+ arr2[i][j];
            }
        }

        PrintArray.printArray(sum);

    }
}
