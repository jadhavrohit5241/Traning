package com.te.java.abstraction;

import java.util.Scanner;


public class Service {
	public Car carFact() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter car brand");
		String inputString = scanner.nextLine();
		if (inputString.equalsIgnoreCase("AUDI")) {
			return new Audi();
		} else if (inputString.equalsIgnoreCase("BMW")) {
			return new Bmw();
		} else {
			throw new ArithmeticException();
		}

	}
}