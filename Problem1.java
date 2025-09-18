// Author: Aravind Kumar Kongara
// Language: Java
// Problem1 - Calculator using Class

import java.util.Scanner;

class Calculator {
	private double a, b;

	public Calculator(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double calculate(String operation) {
		switch (operation.toLowerCase()) {
		case "addition":
			return a + b;
		case "subtraction":
			return a - b;
		case "multiplication":
			return a * b;
		case "division":
			if (b != 0)
				return a / b;
			else
				throw new ArithmeticException("Division by zero!");
		default:
			throw new IllegalArgumentException("Invalid operation!");
		}
	}
}

public class Problem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double a = sc.nextDouble();
		System.out.print("Enter second number: ");
		double b = sc.nextDouble();
		System.out.print("Enter operation (addition, subtraction, multiplication, division): ");
		String op = sc.next();

		Calculator c = new Calculator(a, b);
		System.out.println("Result: " + c.calculate(op));
		sc.close();
	}
}
