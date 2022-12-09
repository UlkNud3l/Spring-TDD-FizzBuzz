package com.jonas.fizzbuzz.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzbuzzCalculatorTest {
	
	private FizzbuzzCalculator calculator;
	
	private final String FIZZ = "fizz";
	private final String BUZZ = "buzz";
	private final String FIZZBUZZ = "fizzbuzz";
	
	public FizzbuzzCalculatorTest() {
		this.calculator = new FizzbuzzCalculator(0); // Arrange
	}
	
	// Act and Assert (testt sind manuell erstellt, da sonst ein fizzbuzz-algorithmus mit einem fizzbuzz-algorithmus getestet werden würde)
	
	@Test
	void printsNotDivisibleNumbers() { // normale nummern zuerst
		assertEquals("1", this.calculator.calculate(1));
		assertEquals("2", this.calculator.calculate(2));
		assertEquals("7", this.calculator.calculate(7));
		assertEquals("8", this.calculator.calculate(8));
		assertEquals("101", this.calculator.calculate(101));
	}
	
	@Test
	void printsFizz() { // fizz testen
		assertEquals(FIZZ, this.calculator.calculate(3));
		assertEquals(FIZZ, this.calculator.calculate(9));
		assertEquals(FIZZ, this.calculator.calculate(18));
		assertEquals(FIZZ, this.calculator.calculate(33));
		assertEquals(FIZZ, this.calculator.calculate(102));
	}
	
	@Test
	void printsBuzz() { // buzz testen
		assertEquals(BUZZ, this.calculator.calculate(5));
		assertEquals(BUZZ, this.calculator.calculate(10));
		assertEquals(BUZZ, this.calculator.calculate(25));
		assertEquals(BUZZ, this.calculator.calculate(50));
		assertEquals(BUZZ, this.calculator.calculate(100));
	}
	
	@Test
	void printsFizzbuzz() { // fizzbuzz testen
		assertEquals(FIZZBUZZ, this.calculator.calculate(15));
		assertEquals(FIZZBUZZ, this.calculator.calculate(30));
		assertEquals(FIZZBUZZ, this.calculator.calculate(60));
		assertEquals(FIZZBUZZ, this.calculator.calculate(75));
		assertEquals(FIZZBUZZ, this.calculator.calculate(150));
	}
	
	@Test
	void testNegatives() { // negative eingaben testen einfach weil
		assertEquals("-1", this.calculator.calculate(-1));
		assertEquals(FIZZ, this.calculator.calculate(-12));
		assertEquals(BUZZ, this.calculator.calculate(-35));
		assertEquals(FIZZBUZZ, this.calculator.calculate(-1500));
		assertEquals("-31", this.calculator.calculate(-31));
	}
	
}
