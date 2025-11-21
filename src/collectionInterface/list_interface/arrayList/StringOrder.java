package collectionInterface.list_interface.arrayList;

import java.util.List;
import java.util.ArrayList;

public class StringOrder {
    public static void main(String[] args) {

        List<Character> list= new ArrayList<>();
        list.add('N');
        list.add('I');
        list.add('T');
        list.add('I');
        list.add('S');
        list.add('H');

        System.out.println(list);

        // Get the Ascii Value of All Character
        // And Store it into asciiVal ArrayList
        List<Integer> asciiVal= new ArrayList<>();
        for(int i= 0; i<list.size(); i++){
            asciiVal.add((int)list.get(i));
        }

        // Code for sorting asciiVal ArrayList
        int temp= 0;
        int i= 0, j= asciiVal.size();
        int max= asciiVal.get(i);
        for(int k= i+1; k<j; k++){
            if(max>asciiVal.get(k)){
                temp= max;

            }
        }

    }
}
