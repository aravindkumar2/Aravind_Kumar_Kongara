// Author: Aravind Kumar Kongara
// Language: Java
// Problem3 - Generate odd numbers up to input number

import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int a = sc.nextInt();

		int limit;
		if (a % 2 == 0) {
			limit = 2 * (a - 1) - 1;
		} else {
			limit = 2 * a - 1;
		}

		for (int i = 1; i <= limit; i += 2) {
			System.out.print(i + " ");
		}

		sc.close();
	}
}
