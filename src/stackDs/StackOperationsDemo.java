package stackDs;

import java.util.Stack;

public class StackOperationsDemo {
    public static void main(){

        Stack<Integer> stack= new Stack<>();
        stack.push(1);
        stack.push(22);
        stack.push(333);
        stack.push(4444);

        // Print the entire stack now
        System.out.println("Data in the Stack: "+stack);
        System.out.println("Pop Operation: "+stack.pop());
        System.out.println("After Pop Operation: "+stack);
        System.out.println("The Element at the top: "+stack.peek());
        System.out.println("After Peek Operation: "+stack);
        System.out.println("Search Operation: "+stack.search(22));
        System.out.println("Is Stack Empty: "+stack.empty());

    }
}
