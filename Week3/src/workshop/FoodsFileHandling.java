package workshop;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FoodsFileHandling {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter fruits name: ");
		String fruits = scanner.nextLine();
		scanner.close();
		try {
		FileWriter fw = new FileWriter("Fruits.txt");
		fw.write(fruits);
		fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
