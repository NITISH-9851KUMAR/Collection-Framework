package collectionInterface.list_interface.Array_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList2D {
    public static void main(String[] args) {

//        Create a 2D array List
        List<List<Integer>> arrList= new ArrayList<>();


        ArrayList<Integer> l1= new ArrayList<>();
        l1.add(10); l1.add(20); l1.add(30);

        ArrayList<Integer> l2= new ArrayList<>();
        l2.add(1); l2.add(2); l2.add(3); l2.add(5); l2.add(7);

        ArrayList<Integer> l3 = new ArrayList<>();
        l3.add(2); l3.add(4); l3.add(6);

        arrList.add(l1); arrList.add(l2); arrList.add(l3);

//        Using Loop
//        for(int i= 0; i<arrList.size(); i++){
//            for(int j= 0; j<arrList.get(i).size(); j++){
//                System.out.print(arrList.get(i).get(j)+" ");
//            }
//            System.out.println();
//        }

        for(List<Integer> list: arrList){
            for(int ele: list){
                System.out.print(ele+" ");
            }
            System.out.println();
        }



    }
}
