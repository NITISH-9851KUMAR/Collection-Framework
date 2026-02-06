package Linked_List;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class StudentLinkedList {

    public static class Student{
        String name;
        double marks;

        public Student(String name, double marks) {
            this.name = name;
            this.marks = marks;
        }

        public String toString(){
            return "Name: %s Marks: %f\n".formatted(name, marks);
        }
    }

    public static void main() {

        Student[] sArray= new Student[5]; // To store 5 Objects
        sArray[0] = new Student("Ram", 79.6);
        sArray[1] = new Student("Rahim", 85.5);
        sArray[2] = new Student("John", 90.1);
        sArray[3] = new Student("Lisa", 69.4);
        sArray[4] = new Student("Ana", 59.8);

        LinkedList<Student> ll= new LinkedList<>(Arrays.asList(sArray));

        // simple printing but it is not good idea
        System.out.println(ll);

//        Print using iterator, using iterator is good idea to print list
        Iterator<Student> itr= ll.iterator();
        Student temp;
        while(itr.hasNext()){
            temp= itr.next();
            System.out.println(temp.toString());
        }
    }

}
