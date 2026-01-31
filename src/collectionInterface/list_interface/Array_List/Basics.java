package collectionInterface.list_interface.Array_List;

import java.util.List;
import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {

          // Create the list of animals
        List<String> animals= new ArrayList<>();

        // add the value into the list
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.print(animals);

    }
}
