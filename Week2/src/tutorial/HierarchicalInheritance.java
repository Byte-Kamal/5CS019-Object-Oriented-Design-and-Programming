package tutorial;

class Animal{
	String name;
	double weight;
	String color;
	int age;
	
	void display() {
		System.out.println("Name: " + name + ", weight: " + weight + ", color: "  + color + ", age: " + age);
	}
	
	void makeSound() {
		System.out.println("Animal make sound.");
	}
}

class Dog extends Animal{
	String breed;
	boolean isIndoor;
	
	Dog(String name, double weight, String color, int age, String breed, boolean isIndoor){
		super.name = name;
		super.weight = weight;
		super.color = color;
		super.age = age;
		this.breed = breed;
		this.isIndoor = isIndoor;
	}
	
	void displayDetails() {
		System.out.println("Dog breed: " + breed + ", isIndoor: " + isIndoor);
	}
	@Override
	void makeSound() {
		System.out.println("Dog make sound.");
	}
}

class Cat extends Animal{
	double height;
	String breed;
	
	Cat(String name, double weight, String color, int age, double height, String breed){
		super.name = name;
		super.weight = weight;
		super.color = color;
		super.age = age;
		this.height = height;
		this.breed = breed;
	}
	
	void displayDetails() {
		System.out.println("Cat Height: " + height);
	}
	
	@Override
	void makeSound() {
		System.out.println("Cat make sound.");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Dog d = new Dog("Anush", 48, "White", 20, "Monkey", false);
		d.display();
		d.displayDetails();
		Cat c = new Cat("Pritam", 44, "White", 19, 5.5, "Gaming");
		c.display();
		c.displayDetails();
		d.makeSound();
		c.makeSound();
	}

}
