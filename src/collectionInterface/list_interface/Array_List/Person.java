package collectionInterface.list_interface.Array_List;

public class Person{
	private String name;
	private int age;
	public Person(String name, int age){
		this.name= name;
		this.age= age;
	}
	public void printData(){
		System.out.println(name+" "+age);
	}
}