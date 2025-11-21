package collectionInterface.list_interface.arrayList;

import java.util.List;
import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {

        // ArrayList class Declaration
        List<Integer> arrayList= new ArrayList<>();

        //Add element into the list
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(60);

        // size of arrayList
        System.out.println(arrayList.size());

        // get the ith index element
        System.out.println(arrayList.get(3));

        // print all the arrayList Element
        System.out.println(arrayList);

        // Remove form ith index element
        arrayList.remove(3);
        System.out.println(arrayList);

        // add element at ith position
        arrayList.add(3, 9);
        System.out.println(arrayList);

        // Modifying element at index
        arrayList.set(4, 88);
        System.out.println(arrayList);

        // Removing an element form arrayList
        arrayList.remove(Integer.valueOf(30)); // Integer.valueOf return the index of i element i.e 30

        System.out.println(arrayList);


    }
}
