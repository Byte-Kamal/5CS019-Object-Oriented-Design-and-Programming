package workshop;

class Calculator{
	void addition(int a, int b) {
		System.out.println("Int Addition: " + (a + b));
	}
	
	void addition(double a, double b) {
		System.out.println("Double Addition: " + (a + b));
	}
	
	void addition(int a, int b, int c) {
		System.out.println("Three Int Addition: " + (a + b + c));
	}
	
	void addition(double a, double b, double c) {
		System.out.println("Three Double Addition: " + (a + b + c));
	}
}



public class MethodOverloadingQuestion {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.addition(5, 8);
		c.addition(10,15,20);
		c.addition(3.5, 2.7);
		c.addition(1.1, 2.2, 3.3);
	}

}
