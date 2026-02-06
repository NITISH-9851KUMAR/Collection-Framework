package Linked_List;

import java.util.LinkedList;
import java.util.List;

public class Basic {
    public static void main() {

        List<String> ll = new LinkedList<>();

        ll.add("Bombay");
        ll.add("Chennai");
        ll.add("Kolkata");
        ll.add("Delhi");
        ll.add("Bangalore");
        ll.add("Guwahati");
        ll.add("Hyderabad");


//        Using simple Printing, it is not recommended
        System.out.println(ll);

//        Using for loop
        for (String ele : ll) {
            System.out.println(ele);
        }

//        printing the list using iterator, it is widely used in programming
//        Iterator<String> itr = ll.iterator();
//        while (itr.hasNext()) {
//            System.out.printf("%s ", itr.next());
//
//        }

    }
}
