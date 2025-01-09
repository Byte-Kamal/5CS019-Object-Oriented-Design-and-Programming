package tutorial;

class AreaCalculator{
	void calculateArea(double length, double width) {
		System.out.println("Area of rectangle is: " + (length * width) );
	}
	
	void calculateArea(double length) {
		System.out.println("Area of square is: " + (length * length));
	}
	
	void calculateArea(int base, int height) {
		System.out.println("Area of triangle is:"+ ((base * height)/2));
	}
	
}

public class AreaCalculatorOverload {

	public static void main(String[] args) {

		AreaCalculator ac = new AreaCalculator();
		ac.calculateArea(5.3, 4.2);
		ac.calculateArea(5);
		ac.calculateArea(5, 4);
	}

}
