package stackDs;

import java.util.Stack;

public class ArrayToStack {
    public static void main(){

        char[] expArray= {'a', '+', 'b' , '*', 'c', '-', '5', 'a'};
        Stack<Character> stack= new Stack<>();

        for(char ch: expArray){
            stack.push(ch);
        }
        System.out.println("The Stack: "+stack);

    }
}
