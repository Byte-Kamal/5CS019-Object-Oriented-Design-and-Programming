package workshop;

interface RemoteControl{
	void powerOn();
	void powerOff();
}

class TV implements RemoteControl{
	
	@Override
	public void powerOn(){
		System.out.println("Power on on TV.");
	}
	
	public void powerOff(){
		System.out.println("Power off on TV.");
	}
}

class AC implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("Power on on AC.");
	}

	@Override
	public void powerOff() {
		System.out.println("Power off on AC.");
	}
	
}

public class RemoteControlInterface {

	public static void main(String[] args) {

	}

}
