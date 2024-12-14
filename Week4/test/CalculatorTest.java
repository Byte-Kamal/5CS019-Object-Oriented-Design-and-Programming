package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tutorial.Calculator;

public class CalculatorTest {
	
	@BeforeEach
	@AfterEach
	void line() {
		System.out.println("-----------------------");
	}
	
//	@BeforeEach
//	void setup() {
//		System.out.println("Before Each Test");
//	}
//	
//	@AfterEach
//	void ending() {
//		System.out.println("After Each Test");
//	}
	
	@Test
	public void testAdd() {
		System.out.println("Add Testing");
		Calculator c = new Calculator();
		assertEquals(4, c.add(1, 3));
	}
	
	@Test
	public void testSubtract() {
		System.out.println("Subtract Testing");
		Calculator c = new Calculator();
		assertEquals(4, c.subtract(7, 3));
	}
}
