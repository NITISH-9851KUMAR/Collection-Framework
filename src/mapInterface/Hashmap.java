package mapInterface;

import java.util.Map;
import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {

        Map<Integer, String> map= new HashMap<>();
        map.put(1, "Aakash Kumar");
        map.put(2, "Divyanshu Roy");
        map.put(3, "Ankush Raj");
        map.put(4, "Nitish Kumar");
        map.put(4, "Nitish Kumar"); // It will not be added duplicate entry
        map.put(5, "Himanshu Kumar");

        System.out.println(map);

    }
}
