package stackDs;


import java.util.ArrayList;
import java.util.Stack;

public class ArrayListToStack {
    public static void main(){

        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Stack<Integer> stack= new Stack<>();
        stack.addAll(list);
        System.out.println(stack);

    }
}
