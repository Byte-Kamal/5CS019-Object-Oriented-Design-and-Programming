package workshop;

abstract class GameCharacter{
	abstract void attack();
	abstract void defend();
}

class Warrior extends GameCharacter{

	@Override
	void attack() {
		System.out.println("Attack by Warrior");
	}

	@Override
	void defend() {
		System.out.println("Defend by Warrior");
		
	}
	
}

public class GameCharacterAbstractionExample {

	public static void main(String[] args) {

	}

}
