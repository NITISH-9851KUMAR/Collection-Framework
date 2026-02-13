package stackDs;

import java.util.Stack;

public class StackCreateDemo {
    public static void main(){

        Stack<Integer> stack= new Stack<>();
        System.out.printf("Stack Contains: %s\n",stack);
        System.out.printf("Is empty Stack? %s",stack.isEmpty());

    }
}
