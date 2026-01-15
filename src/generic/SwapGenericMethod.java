package generic;
public class SwapGenericMethod{

	public static <T> void swap(T val1, T val2){
		// print before the swap
		System.out.println("Before Swap Val1:"+val1+"  Val2:"+val2);

		T temp;
		temp= val1;
		val1= val2;
		val2= temp;

		// Print After the swap
		System.out.println("After Swap Val1:"+val1+"  Val2:"+val2+"\n");
	}

	public static void main(String[] args){
		// Integer Type
		System.out.println("Integer Type");
		Integer x= 10;
		Integer y= 20;
		swap(x, y);

		// Double Type
		System.out.println("Double Type");
		Double d1= 23.23;
		Double d2= 34.34;
		swap(d1, d2);

		// String Type
		System.out.println("String Type");
		String s1= "Me";
		String s2= "You";
		swap(s1, s2);

	}
}
