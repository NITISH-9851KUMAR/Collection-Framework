package generic;
public class GenericClass{

	static class Student{
		String name;
		String city;

		Student(String name, String city){
			this.name= name;
			this.city= city;
		}
	}

	static class GenericclassT<T>{
		T val;

		GenericclassT(T obj){
			val= obj;
		}

		T getValue(){
			//System.out.println(this.val);
			return this.val;
		}
		
	}

	public static void main( ){

		//  Integer type
		GenericclassT<Integer> intT= new GenericclassT<>(10);
		System.out.println(intT.getValue());

		// String type
		GenericclassT<String> str= new GenericclassT<>("Joy with Java");
		System.out.println(str.getValue());

		// User Defined type
		Student student= new Student("Nitish", "Saharsa");
		GenericclassT<Student> st= new GenericclassT<>(student);
		System.out.println(st.getValue().name);
		System.out.println(st.getValue().city);
	}
	
}
