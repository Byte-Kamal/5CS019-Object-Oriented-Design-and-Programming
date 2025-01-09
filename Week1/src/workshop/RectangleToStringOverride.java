package workshop;

class Rectangle{
	double width;
	double height;
	
	Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public String toString() {
		return "Rectangle [Width = " + width + ", Height = " + height + "]";
	}
}

public class RectangleToStringOverride {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(10, 20);
		System.out.println(rec.toString());
	}

}
