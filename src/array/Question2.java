/**
 * Search in Array
 */

package array;

public class Question2 {
    public static void main() {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int value= 40;

//         odd*2 even+10
        boolean flag= false;
        for (int i: arr) {
            if (i==value) {
                flag= true;
                break;
            }
        }
        if(flag) System.out.println("Present hai array me");
        else System.out.println("Present nahi hai array me");
    }

}
