package tutorial;

class MathOperations{
	void addition(int a, int b) {
		System.out.println("Adding two integer: " + (a+b));
	}
	void addition(double a, double b) {
		System.out.println("Adding two double: " + (a+b));
	}
	void addition(int a, int b, int c) {
		System.out.println("Adding three integer: " + (a+b+c));
	}
}

public class OverloadingMathOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperations mo = new MathOperations();
		mo.addition(5, 4);
		mo.addition(5.5, 6.8);
		mo.addition(5, 4, 3);
	}

}
