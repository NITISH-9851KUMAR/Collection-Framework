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

	static class GenericClassT<T>{
		T val;

		GenericClassT(T obj){
			val= obj;
		}

		T getValue(){
			//System.out.println(this.val);
			return this.val;
		}
		
	}

	public static void main( ){

		//  Integer type
		GenericClassT<Integer> intT= new GenericClassT<>(10);
		System.out.println(intT.getValue());
		// No need to type conversion getValue() return Integer type but, it automatically does type cast
		int val= intT.getValue();
		System.out.println(val);

		// String type
		GenericClassT<String> str= new GenericClassT<>("Joy with Java");
		System.out.println(str.getValue());

		// User Defined type
		Student student= new Student("Name", "How Town");
		GenericClassT<Student> st= new GenericClassT<>(student);
		System.out.println(st.getValue().name);
		System.out.println(st.getValue().city);
	}
	
}
