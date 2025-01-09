package workshop;

class Shape {
	void getPerimeter() {
		System.out.println("Perimeter in Shape without a valid shape is nothing");
	}
	
	void getArea() {
		System.out.println("Area in shape is undefined as we can't have any shape");
	}
}

class Circle extends Shape{
	double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	@Override
	void getPerimeter() {
		System.out.println("Perimeter of Circle: " + 2 * Math.PI * radius);
	}
	
	@Override
	void getArea() {
		System.out.println("Area of Circle: " + Math.PI * radius * radius);
	}
}

public class MethodOverridingPractice {
	public static void main(String[] args) {
		Circle c = new Circle(7);
		c.getPerimeter();
		c.getArea();
	}

}
