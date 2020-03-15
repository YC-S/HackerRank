package _30_days_of_code;

import java.util.Scanner;

public class Day9_Recursion3 {
	private static final Scanner scanner = new Scanner(System.in);

	private static int factorial(int n) {
		if (n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		int n = scanner.nextInt();
		System.out.println(factorial(n));
	}
}
