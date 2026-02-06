package Linked_List;

import javax.swing.text.Element;
import java.util.LinkedList;

public class OtherMethod {
    public static void main() {

        LinkedList<Character> iLetters = new LinkedList<>();
        iLetters.add('A');
        iLetters.add('B');
        iLetters.add('C');
        iLetters.add('D');
        iLetters.add('E');
        iLetters.add('F');
        iLetters.add('G');
        iLetters.add('H');
        iLetters.add('I');
        iLetters.add('J');
        iLetters.add('K');
        iLetters.add('L');
        iLetters.add('M');
        iLetters.add('N');

//        Finding the elements from the list
        boolean status= iLetters.contains('G');
        if(status) System.out.println("List contains the element 'G'");
        else System.out.println("List doesn't contains the element 'G'");

//        Size of the list
        System.out.printf("Size of List %d\n",iLetters.size());

        // get and set element from the list
        iLetters.set(iLetters.size()-1, 'z');
        System.out.println(iLetters);

        System.out.println("Element at Position: "+iLetters.get(11));
    }

}
