package com.jonas.fizzbuzz.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jonas.fizzbuzz.logic.FizzbuzzCalculator;

@RestController
public class FizzbuzzController {
	
	public static final String ERROR = "Bad Request. Only use HTTP-GET and provide an integer in url path.";
	
	@GetMapping("{fizzbuzz}")
	public String[] fizzbuzz(@PathVariable(value = "fizzbuzz") String max) {
		int maxInt;
		
		try {
			maxInt = Integer.valueOf(max);
		}
		catch (NumberFormatException e) {
			String[] ret = {ERROR};
			return ret;
		} finally {}
		
		return new FizzbuzzCalculator(maxInt).getFizzbuzzArray();
	}
	
	@GetMapping("*")
	public String[] other() {
		String[] ret = {ERROR};
		return ret;
	}
	
}
