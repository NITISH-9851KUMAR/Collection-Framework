package generic;

public class WildCardBound {

	static class Animal{
		long lifespan;
		double weight;

		Animal(long years, double kg){
			lifespan= years;
			weight= kg;
		}

		void print(){
			System.out.println("Maximum longevity: "+lifespan+ " in years");
			System.out.println("Maximum weight: "+weight+"  in kgs");
		}
	} // End of Animal class

	static class Aquatic extends Animal{
		boolean scale;
		Aquatic(long years, double kgs, boolean skin){
			super(years, kgs);
			scale= skin;
		}

		public void print(){
			super.print();
			System.out.println("Has scale ? "+scale);
		}
	}// End of class Aquatic


	static class Land extends Animal{
		short vision;
		Land(long years, double kg, short vision){
			super(years, kg);
			this.vision= vision;
		}
	}// End of class Land

	static class Pet extends Land{
		String name;
		Pet(long years, double kg, short vision, String name){
			super(years, kg, vision);
			this.name= name;
		}
	}// End of Class Pet

	static class Wild extends Land{
		float speed;
		Wild(long years, double kg, short vision, float speed){
			super(years, kg, vision);
			this.speed= speed;
		}
	}// End of Class Wild


	/* WildCard bounds start from there */
	 						 // It is upper bound
	static class AnimalWorld<T extends Animal>{
		// Type parameter is limited to Animal and its subclass
		T[] listOfAnimals;

		AnimalWorld(T[] list){
			listOfAnimals= list;
		}
	}// End of generic class AnimalWorld

	// Case 1: Unbounded wildcard: Any object can be passed as its argument
//	static void vitality(AnimalWorld<?> animals){
//		// To print the vitality of animals in the list of animals
//		for(Animal a: animals)
//			a.print();
//		System.out.println();
//	}

	// Case 2: Lower bounded wildcard: Any object of Aquatic or Animal can be passed as its argument
//	static void showSea(AnimalWorld<? super Aquatic> animals){
//		// For aquatic or unknown animals
//		for(Object obj : animals)
//			obj.print();
//				// Call the method defined in Animal/ Aquatic class
//		System.out.println();
//	}

	// Case 3a: Upper bounded wildcard: Any object of Land/ Pet Wild can be passed as its argument.
	static void showLand(AnimalWorld<? extends Land> animals){
		// For Land or any of its subclasses
		for(int i=0; i<animals.listOfAnimals.length; i++){
			animals.listOfAnimals[i].print();
			// call the method defined in Animal class
			System.out.println("Vision: "+animals.listOfAnimals[i].vision);
		}
		System.out.println();
	}

	// Case 3b: Upper bounded wildcard: Any object of only Pet class can be passed as its argument.
	static void showPet(AnimalWorld<? extends Pet> animals){
		// For lists of Pet objects only
		for(int i= 0; i<animals.listOfAnimals.length; i++){
			System.out.println("Pet's name: "+animals.listOfAnimals[i].name);
			animals.listOfAnimals[i].print();
			// call the method defined in Animal class
			System.out.println("Vision : "+animals.listOfAnimals[i].vision);
		}
		System.out.println();
	}

	// Case 3c: Upper bounded wildcard: Any object of only Wild class can be passed as its argumnet.
//	static void showWild(AnimalWorld<? extends Wild> animals){
//		// For Object of Wild class only
//		for(int i= 0; i<animals.listOfAnimals.length; i++){
//			animals.listOfAnimals[i].print();
//			// call the method defined in Animal class
//			System.out.println("Maximum running speed: "+animals.listOfAnimals[i].speed+" in path");
//		}	System.out.println("Vision : "+animals.listOfAnimals[i].vision);
//		System.out.println();
//	}


	public static void main(String[] args) {
/*
		// Create a list of unknown animals of class Animal
		Animal unknown= new Animal(40, 720);
		Animal u[]= {unknown};
		AnimalWOrld<Animal> uList= new AnimalWorld<>(u);

		// create a list of aquatic animals
		Aquatic whale= new Aquatic(90, 150000);
		Aquatic shart= new Aquatic(400, 2150);
		Animal q[]= {whale, shart};
		AnimalWorld<Aquatic> qList= new AnimalWorld<>(q);

		// create a list of land animals
		Land owl= new Land(3, 10, 0);
		Land []l= {owl};
		AnimalWorld<Land> lList= new AnimalWorld<>(l);

		// create the list of pet animals
		Pet dog= new Pet(15, 75, 2, "Prince");
		Pet p[]= {dog};
		AnimalWorld<Pet> pList= new AnimalWorld<>(p);

		// Create a list of wild animals
		Wild cheetah= new Land(15, 75, 2);
		Wild deer= new Land(10, 50, 1);
		Wild w[]= {cheetah, deer};
		AnimalWorld<Wild> wList= new AnimalWorld<>(w);

		// call the methods and see the outcomes
		// vitality(...) is with unlimited wildcard argument and hence we can pass argument of any type
		vitality(uList);
		vitality(qList);
		vitality(lList);
		vitality(pList);
		vitality(wList);

		// showSea(...) is with lower bound wildcard argument with class aquantic and its super classes
		showSea(uList);
		showSea(qList);
		showSea(lList); // compile-time error
		showSea(pList); // compile-time error
		showSea(wList); // compile-time error

		// showLand(...) is with upper bound wildcard argument with class Land and it subclassed
		showLand(uList); // compile-time error
		showLand(qList); // compile-time error
		showLand(lList);
		showLand(pList);
		showLand(wList);

		// showWild(...) is with upper bound wildcard argument with class Land and it subclassed
		showWild(uList); // compile-time error
		showWild(qList); // compile-time error
		showWild(lList); // compile-time error
		showWild(pList); // compile-time error
		showWild(wList); */

	}

}// Main class