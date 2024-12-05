package tutorial;

interface Shape{
	void calculateArea();
	void calculatePerimeter();
}

class Circle implements Shape{
	double r;
	
	Circle (double r){
		this.r = r;
	}
	
	@Override
	public void calculateArea() {
		System.out.println("Area of Circle: " + (Math.PI * r * r));
	}
	
	public void calculatePerimeter() {
		System.out.println("Perimeter of Circle: " + (2 * Math.PI * r));
	}
}

class Rectangle implements Shape{
	double length;
	double width;
	
	Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}
	
	@Override
	public void calculateArea() {
		System.out.println("Area of Rectangle: " + (length * width));
	}
	
	public void calculatePerimeter() {
		System.out.println("Perimeter of Rectangle: " + 2 * (length + width));
	}
}

public class InterfaceExampleShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(7);
		c.calculateArea();
		c.calculatePerimeter();
		
		Rectangle r = new Rectangle(10, 8);
		r.calculateArea();
		r.calculatePerimeter();
	}

}
