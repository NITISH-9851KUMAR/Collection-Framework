package mapInterface;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

public class Hashmap {
    public static void main() {

        Map<Integer, String> map= new HashMap<>();
        map.put(101, "Aakash Kumar");
        map.put(102, "Divyanshu Kumar");
        map.put(105, "Himanshu Kumar");
        map.put(103, "Ankush Kumar");
        map.put(104, "Nitish Kumar");
        map.put(102,"Manohar Kumar");

//        System.out.println(map);
//        System.out.println("Size of hasMap: "+map.size());
//
//        System.out.println(map.get(104));
//        System.out.println(map.keySet());
//        System.out.println(map.values());
//        System.out.println(map.entrySet());

//        for(int k:map.keySet()){
//            System.out.println(map.get(k));
//        }

        Iterator<Entry<Integer, String>> it=map.entrySet().iterator();
        while(it.hasNext()){
            Entry<Integer, String> entry= it.next();
            System.out.println(entry.getKey());
        }


    }
}
