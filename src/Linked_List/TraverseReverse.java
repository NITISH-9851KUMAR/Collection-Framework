package Linked_List;

import java.util.Iterator;
import java.util.LinkedList;

public class TraverseReverse {
    public static void main() {

        LinkedList<String> lCountries = new LinkedList<>();
        lCountries.add("Mumbai");
        lCountries.add("Chennai");
        lCountries.add("Kolkata");
        lCountries.add("Delhi");
        lCountries.add("Bangalore");
        lCountries.add("Guwahati");
        lCountries.add("Hyderabad");
        System.out.println(lCountries);

//        Iterate in reverse order
        Iterator<String> itr= lCountries.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
