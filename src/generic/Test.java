package generic;

public class Test {

    static class GenericClass<T extends Number>{
        T[] marks;

        GenericClass(T[] marks){
            this.marks= marks;
        }

        double total(){
            double sum= 0.0;
            for(T ele: marks){
                sum += ele.doubleValue();
            }
            return sum;
        }

        boolean compareMarkss(GenericClass<?> marks){
            return total()==marks.total();
        }

    }

    public static void main() {

        Integer[] marks1= {42, 58, 93, 93};
        GenericClass<Integer> intMarks= new GenericClass<>(marks1);

        Double[] marks2= {42.32, 58.3, 93.5, 93.2};
        GenericClass<Double> doubleMarks= new GenericClass<>(marks2);

        if(intMarks.compareMarkss(doubleMarks)){
            System.out.println("Same marks");
        }else{
            System.out.println("Different Marks");
        }

    }
}
