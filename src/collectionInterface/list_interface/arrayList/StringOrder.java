package collectionInterface.list_interface.arrayList;

import java.util.ArrayList;
import java.util.List;

public class StringOrder {
    public static void main(String[] args) {

        int[] arr = {15, 5, 9, 20, 8};

        int max = 0;
        // show above arr into the ascending Order
        // 5, 9, 8, 15, 20

        List<Character> list= new ArrayList<>();
        list.add('Z');
        list.add('Y');
        list.add('T');
        list.add('F');
        list.add('E');
        list.add('B');

        // Print List Value
        System.out.println(list);

        // Get the Ascii Value of All Character
        // And Store it into asciiVal ArrayList
        List<Integer> asciiVal= new ArrayList<>();
        for(int i= 0; i<list.size(); i++){
            asciiVal.add((int)list.get(i));
        }

        // Code for sorting asciiVal ArrayList
        // Outer loop traverse form 0th index to last index of an array
        Outer_Loop:
        for (int i = 0; i < asciiVal.size(); i++) {
            // Inner Loop will traverse from i+1 Index
            Inner_Loop:
            for (int j = i + 1; j < asciiVal.size(); j++) {
                max = asciiVal.get(i);
                if (max > asciiVal.get(j)) {
                    int temp= asciiVal.get(i);
                    asciiVal.set(i, asciiVal.get(j));
                    asciiVal.set(j, temp);
                }
            }
        }

        // change Integer value into character and store into list
        for (int i = 0; i < asciiVal.size(); i++) {
            int val = asciiVal.get(i);
            char ch = (char) val;
            list.set(i, ch);
        }

        // Print the list
        System.out.println(list);

    }
}
