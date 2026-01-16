package generic;

public class WildCard {

    static class Student<T extends Number> {
        T[] marks;

        Student(T[] marks) { // constructor
            this.marks = marks;
        }

        double average() {
            double sum = 0.0;
            for (T ele : marks)
                sum += ele.doubleValue();
            return sum / marks.length;
        }

        // // compare total value with two object
        // in this instead of T we need to write ?, actually it is wildcard
        boolean compareMarks(Student<?> others) {
            return average() == others.average();
//            above line is same as below code
//            return average() == others.average() ? true: false;
        }

    }

    public static void main() {
        Student<Integer> intGc = new Student<>(new Integer[]{1, 2, 3});
        System.out.println(intGc.average());

        // It works because it is same type of Object
        Student<Integer> int2Gc = new Student<>(new Integer[]{1, 2, 3});
        if (intGc.compareMarks(int2Gc)){
            System.out.println("Same marks");
        } else System.out.println("Different Marks");

        Student<Double> doubleGc = new Student<>(new Double[]{1.1, 1.2, 1.3});
        System.out.println(doubleGc.average());

        // Error two object are not same type it invite casting of type problem
        // After change ? Instead of T in Student<> compare then it will execute
        if (intGc.compareMarks(doubleGc)) {
            System.out.println("Same marks");
        } else System.out.println("Different Marks");


    }
}