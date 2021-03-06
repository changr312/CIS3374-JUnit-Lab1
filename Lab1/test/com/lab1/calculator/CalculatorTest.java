package com.lab1.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calculator;
	
	@Before
	public void setUp(){
		calculator = new Calculator();
	}

	@Test
	public void addTest(){
		assertEquals(4, calculator.add(2, 2));
	}
	
	@Test
	public void subtractTest(){
		assertEquals(12, calculator.subtract(14, 2));
	}
	
	@Test
	public void multiplyTest(){
		assertEquals(6, calculator.multiply(3, 2));
	}
	
	@Test
	public void divideTest(){
		assertEquals(3, calculator.divide(6, 2));
	}
	
	@Test
	public void isEqualPositiveTest(){
		assertTrue(calculator.isEqual(5, 5));
	}
	
	@Test
	public void isEqualNegativeTest(){
		assertFalse(calculator.isEqual(15, 3));
	}
}
