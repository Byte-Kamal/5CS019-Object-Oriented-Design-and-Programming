package workshop;

abstract class Vehicle{
	abstract void startEngine();
	abstract void stopEngine();
}

// Car class is already declared so I change the name to Car1
class Car1 extends Vehicle{
	@Override
	void startEngine() {
		System.out.println("Car Engine Started");
	}
	
	@Override
	void stopEngine() {
		System.out.println("Car Engine Stopped");
	}
}

class Motorcycle extends Vehicle{
	@Override
	void startEngine() {
		System.out.println("Motorcycle Engine Started");
	}
	
	@Override
	void stopEngine() {
		System.out.println("Motorcycle Engine Stopped");
	}
}

public class VehicleAbstractionExample {

	public static void main(String[] args) {

	}

}
