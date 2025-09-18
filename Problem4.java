// Author: Aravind Kumar Kongara
// Language: Java
// Problem4 - Count multiples of 1–9 in a given list

import java.util.Scanner;
	
	public class Problem4 {
		public static Map<Integer, Integer> getMultipleCounts(List<Integer> numbers) {
			Map<Integer, Integer> counts = new HashMap<>();
	
			for (int i = 1; i <= 9; i++) {
				counts.put(i, 0);
			}
	
			for (int divisor = 1; divisor <= 9; divisor++) {
				int count = 0;
				for (int num : numbers) {
					if (num % divisor == 0) {
						count++;
					}
				}
				counts.put(divisor, count);
			}
	
			return counts;
		}
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter numbers separated by space:");
	
			String inputLine = scanner.nextLine();
			String[] inputStrings = inputLine.trim().split("\\s+");
	
			List<Integer> inputNumbers = new ArrayList<>();
			for (String s : inputStrings) {
				try {
					inputNumbers.add(Integer.parseInt(s));
				} catch (NumberFormatException e) {
					System.out.println("Invalid input ignored: " + s);
				}
			}
	
			Map<Integer, Integer> result = getMultipleCounts(inputNumbers);
			System.out.println("Output:");
			System.out.println(result);
	
			scanner.close();
		}
	}
