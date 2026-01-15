package generic;
public class GenericMethod{
	// Defining a generic method to print any data type
	// <T> is called a Type Parameter
	static <T> void genericPrint(T t){
		System.out.print(t);
	}
	public static void main(String[] args){
		//System.out.println("Hello World");
		genericPrint(101);
		genericPrint("Joy With Java");
		genericPrint(3.2232);
	}
}