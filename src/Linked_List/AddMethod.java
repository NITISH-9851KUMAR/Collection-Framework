package Linked_List;

import java.util.LinkedList;

public class AddMethod {
    public static void main(String[] args) {

//        Declare first list
        LinkedList<String> ll= new LinkedList<>();
        ll.add("Mumbai");
        ll.add("Chennai");
        ll.addLast("Kolkata");
        ll.addFirst("Delhi");
        ll.add(1, "Pune");
        System.out.println(ll);

//        Declare 2nd list
        LinkedList<String> ll2= new LinkedList<>();
        ll2.add("MLA Nadia");
        ll2.add("MLA Kharagpur");
        ll2.addLast("MLA Ilahabad");
        ll2.addFirst("MLA Dauram");
        System.out.println(ll2);

//        add second list into first list
        ll.addAll(ll2);
        System.out.println(ll);

//      Third List
        LinkedList<String> ll3= new LinkedList<>();
        ll3.add("MLA Chakiya");
        ll3.add("MLA Loutash");
        ll3.addLast("MLA Mijnupur");

        // add a 3rd list into another 1st list on specific index
        ll.addAll(2, ll3);
        System.out.println(ll);

    }
}
