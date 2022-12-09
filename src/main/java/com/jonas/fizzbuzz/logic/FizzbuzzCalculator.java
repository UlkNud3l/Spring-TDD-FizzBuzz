package com.jonas.fizzbuzz.logic;

public class FizzbuzzCalculator {
	private int max;
	
	public FizzbuzzCalculator(int max) {
		this.max = max;
	}
	
	// methode zur berechnung wurde inkrementell aufgebaut, um alle tests zu bestehen
	public String calculate(int i) {	
		return i % 15 == 0 ? "fizzbuzz" : i % 5 == 0 ? "buzz" : i % 3 == 0 ? "fizz" : Integer.toString(i);
	}
	
	private int calculateIndex(int number) {
		return Math.abs(number-1);
	}
	
	// wird nur internal genutzt, öffentlich zu test-zwecken
	public String[] getFizzbuzzArray() {
		String[] ret;
		
		if (this.max >= 1) {
			ret = new String[this.max];
			for (int i = 1; i <= this.max; i++) {
				ret[calculateIndex(i)] = calculate(i);
			}
			return ret;
		} else { // falls gelieferte nummer negativ ist. habe ich noch nie in einer fizzbuzz-anwendung gesehen, aber aufgabenstellung exkludiert nicht die verarbeitung von negativen nummern.
			ret = new String[Math.abs(this.max)+2];
			for (int i = 1; i >= this.max; i--) {
				ret[calculateIndex(i)] = calculate(i);
			}
			return ret;
		}
	}
	
}
