package workshop;

class Animal{
	String name;
	int age;
	
	Animal(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	
}
class Dog extends Animal{
	String breed;
	Dog(String name,String breed, int age){
		super(name,age);
		this.breed = breed;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\nAge: " + age + "\nBreed: " + breed;
	}
}

public class ConstructorExample {

	public static void main(String[] args) {
		Dog dog1 = new Dog("Anush","German",12);
		System.out.println(dog1.toString());
	}

}