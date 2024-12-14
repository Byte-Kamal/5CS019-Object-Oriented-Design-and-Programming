package tutorial;

public class SimpleInterest {
	public static void main(String[] args) {
		int principle = 10000;
		double time = 3.5;
		double rate = 5;
		double simpleInterest = (principle * time * rate) / 100;
		System.out.print("Simple Interest is: " + simpleInterest);
	}
}
