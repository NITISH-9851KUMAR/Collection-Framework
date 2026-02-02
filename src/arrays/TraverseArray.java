package arrays;

import java.util.Arrays;
import java.util.Spliterator;

public class TraverseArray{
	public static void main(String[] args) {
		
//		int[] intArr= {10, 20, 15, 22, 35};
		int[] intArr = {10, 20, 30, 40, 50};

		Spliterator.OfInt sp = Arrays.spliterator(intArr);

		sp.forEachRemaining( (int x)-> System.out.println(x));

	}
}