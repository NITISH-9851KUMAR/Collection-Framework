package generic;
public class ClassMulParameter {

	static class GenericClass<T, V>{

		T obj1;
		V obj2;

		GenericClass(T obj1, V obj2){ // constructor
			this.obj1= obj1;
			this.obj2= obj2;
		}

		void print(){
			System.out.println("First Element: "+obj1);
			System.out.println("Second Element: "+obj2+"\n");
		}

	}

	public static void main(String[] args){

		GenericClass<String, Integer> obj1= new GenericClass<>("GC", 9);
		obj1.print();

		GenericClass<Character, Double> obj2= new GenericClass<>('g', 22.32);
		obj2.print();

	}

}