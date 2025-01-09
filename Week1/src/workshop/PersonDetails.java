package workshop;

class Person{
	String name;
	int age;
	String address;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Person(String name, String address){
		this.name = name;
		this.address = address;
	}
	
	public void personDetails(String name, int age) {
		System.out.println(name + " is " + age + " years old.");
	}
	
	public void personDetails(String name, String address) {
		System.out.println(name + " live in " + address + ".");
	}
}

public class PersonDetails {

	public static void main(String[] args) {
		Person person1 = new Person("Kamal", 20);
		Person person2 = new Person("Anil", "Jarankhu");
		person1.personDetails(person1.name, person1.age);
		person2.personDetails(person2.name, person2.address);
	}

}
