package generic;

public class SwapGenericClass {

    static class Person {
        String name;
        String city;

        Person(String name, String city) {
            this.name = name;
            this.city = city;
        }

        static void printData(Person p) {
            System.out.println("Name: " + p.name + "  City: " + p.city);
        }
    }

    static <T> void swap(T obj1, T obj2){
        Person p1= (Person)obj1;
        Person p2= (Person)obj2;

        System.out.println("==== Before Swap ====");
        Person.printData(p1);
        Person.printData(p2);
        System.out.println();

        // Swapping Object value
        System.out.println("==== After Swap ====");
        Person temp= p1;
        p1= p2;
        p2= temp;

        Person.printData(p1);
        Person.printData(p2);

    }

    public static void main(String[] args) {

        Person p1 = new Person("Nitish", "Saharsa");
        Person p2 = new Person("Pathak", "Motihari");

        swap(p1, p2);

    }
}