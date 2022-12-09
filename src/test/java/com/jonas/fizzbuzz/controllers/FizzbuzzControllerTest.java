package com.jonas.fizzbuzz.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzbuzzControllerTest {
	
	private FizzbuzzController controller;
	
	public FizzbuzzControllerTest() {
		this.controller = new FizzbuzzController(); // Arrange (contoller muss nicht besonders konfiguriert werden und kann über alle tests gleich verwendet werden)
	}
	
	@Test
	void testException() { // testet die reaktion des controllers auf nicht-numerische eingaben
		String[] response = this.controller.fizzbuzz("test"); // Act
		assertEquals(FizzbuzzController.ERROR, response[0]); // Assert
	}
	
	@Test
	void testValidNumber() { // testet grob die syntax der rückgabe (semantik wird in der logik getestet)
		String[] response = this.controller.fizzbuzz("15"); // Act
		assertTrue(response[0].equals("1") && response[response.length-1].equals("fizzbuzz")); // Assert
	}
	
}
