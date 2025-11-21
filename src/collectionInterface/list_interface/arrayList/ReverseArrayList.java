package collectionInterface.list_interface.arrayList;

import java.util.List;
import java.util.ArrayList;

public class ReverseArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.add(0);
        arrayList.add(10);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(22);
        arrayList.add(10);
        arrayList.add(90);

        System.out.println(arrayList);

        // Reverse of arrayList
        int fIdx= 0;
        int lIdx= arrayList.size()-1;

        // 0 10 3 5 22 10
        // 0  1   2  3  4    5

        int temp= 0;

        while(fIdx<=lIdx){
            temp= arrayList.get(fIdx);
            arrayList.set(fIdx, arrayList.get(lIdx));
            arrayList.set(lIdx, temp);
            fIdx++;
            lIdx--;
        }
        System.out.println(arrayList);

    }

}
