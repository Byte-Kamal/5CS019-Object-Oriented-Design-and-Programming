package tutorial;

class GrandParent{
	
	void displayGrant() {
		System.out.println("I am Grandparent");
	}
}

class Parent extends GrandParent{
	void displayParent() {
		System.out.println("I am Parent");
	}
}

class Child extends Parent{
	void displayChild() {
		System.out.println("I am Child");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.displayGrant();
		c.displayParent();
		c.displayChild();
	}

}
