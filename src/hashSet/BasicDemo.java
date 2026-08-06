package hashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class BasicDemo {
    public static void main() {

        HashSet myset= new HashSet();

        myset.add('A');
        myset.add("A");
        myset.add(true);
        myset.add(19);
        myset.add(3.3);
        myset.add('B');

        System.out.println(myset);

        myset.remove("A");

        System.out.println(myset);

        ArrayList myList= new ArrayList(myset);
        System.out.println(myList);

        System.out.println(myList.get(2));

        Iterator <Object>it= myset.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

}
