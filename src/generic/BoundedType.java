package generic;
public class BoundedType{
							  // It is upper bound
	static class GenericClass<T extends Number>{
		T[] arr;

		GenericClass(T[] arr){ // constructor
			this.arr= arr;
		}

		double average= 0;
		double average(){
			double sum= 0.0;
			for(T ele : arr)
				sum += ele.doubleValue();

			return average= sum / arr.length;
		}

	}

	public static void main() {

		GenericClass<Integer> intGc= new GenericClass<>(new Integer[]{1, 2, 3});
		System.out.println(intGc.average());

		GenericClass<Double> doubleGc= new GenericClass<>(new Double[]{1.1, 1.2, 1.3});
		System.out.println(doubleGc.average());

		GenericClass<Float> floatGc= new GenericClass<>(new Float[]{1.1F, 1.2F, 1.3F});
		System.out.println(floatGc.average());

		/* It will give error
		GenericClass<String> stringGc= new GenericClass<>(new String[]{"a", "b", "c", "d"});
		System.out.println(stringGc.average());
		*/
	}
}