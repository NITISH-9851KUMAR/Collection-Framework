package generic;

public class Test {

    static class GenericClass<T>{
        T arr[];

        GenericClass(T arr[]){
            this.arr= arr;
        }

        T[] getArr(){
            return arr;
        }

        void printArr(T arr[]){
            for(T ele: arr)
                System.out.print(ele+" ");
        }

    }

    public static void main() {

        Integer arr[]= {1, 2, 3, 4, 5};
        GenericClass<Integer> gt= new GenericClass<>(arr);
        gt.printArr(gt.getArr());


    }
}
