package array.array1D;

public class LinearSearch {
    public static void main(){

        int[] arr = {12, 3, 27, 53, 18, 62, 88, 6};
        int key= 18, idx= -1;
        for(int i= 0; i<arr.length; i++){
            if(arr[i]==key){
                idx= i;
                break;
            }
        }
        if(idx==0) System.out.println("Not found");
        else System.out.printf("Element is present :%d Position",idx+1);

    }
}
