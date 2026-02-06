package Linked_List;

import java.util.LinkedList;

public class DeleteMethod {
    public static void main() {

        LinkedList<String> list= new LinkedList<>();
        LinkedList<String> list2= new LinkedList<>();
        list2.add("B");
        list2.add("Z");

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("I");
        list.add("B");
        list.add("O");
        list.add("U");
        list.add("H");
        list.add("D");
        System.out.println(list);

//      Both, removes first element from the list
        list.removeFirst();
        list.remove();
        System.out.println(list);

//        remove object form list
        list.remove("H");
        System.out.println(list);

//        Remove element from specified indexing
        list.remove(2);
        System.out.println(list);

//        Goes on list and delete All element which is in list2
        list.removeAll(list2);
        System.out.println(list);

//        It will remove only First Element B from the list
        list.removeFirstOccurrence("B");
        System.out.println(list);

//        Remove all element from list
        list.clear();
        System.out.printf("Print list after class clear() method: %s",list);
    }

}
