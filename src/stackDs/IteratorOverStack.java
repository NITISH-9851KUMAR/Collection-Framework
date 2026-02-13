package stackDs;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class IteratorOverStack {
    public static void main(){

        Stack<String> stackOfPlates= new Stack<>();
        stackOfPlates.add("Plate 1");
        stackOfPlates.add("Plate 2");
        stackOfPlates.add("Plate 3");
        stackOfPlates.add("Plate 4");

        System.out.println("=== Iterator Over stack using ForEach() method");
        stackOfPlates.forEach(plate->{
            System.out.println(plate);
        });

        System.out.println("=== Iterator Over stack using iterator() ===");
        Iterator<String> plateIterator= stackOfPlates.iterator();
        while(plateIterator.hasNext()){
            String plate= plateIterator.next();
            System.out.println(plate);
        }

        System.out.println("=== Iterator Over stack From Top To Bottom using ListIterator===");
        ListIterator<String> plateListIterator= stackOfPlates.listIterator(stackOfPlates.size());
        while(plateListIterator.hasPrevious()){
            String plate= plateListIterator.previous();
            System.out.println(plate);
        }


    }
}
