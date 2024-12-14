package tutorial;

class Shape{
	String color;
	
	void printArea() {
		
	}
}
class Rectangle extends Shape{
	int length;
	int width;
	
	Rectangle(String color, int length, int width){
		super.color = color;
		this.length = length;
		this.width = width;
	}
	
	@Override
	void printArea() {
		System.out.println("Area of rectangle: " + (length * width));
	}
}

public class SuperExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec = new Rectangle("Blue", 5, 4);
		rec.printArea();
	}

}
