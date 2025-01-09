package tutorial;

class A{
	void display() {
		System.out.println("I am Class A");
	}
}

class B extends A{
	@Override
	void display() {
		System.out.println("I am Class B");
	}
}

public class MethodsOverriding {

	public static void main(String[] args) {
		B b = new B();
		b.display();
	}

}
