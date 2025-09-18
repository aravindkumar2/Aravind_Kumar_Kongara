// Author: Aravind Kumar Kongara
// Language: Java
// Problem2 - Generate first n odd numbers


import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print((2 * i - 1) + " ");
		}
		sc.close();
	}
}
