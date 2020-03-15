package _30_days_of_code;

import java.util.Scanner;

public class Day5_Loops {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + n * i);
		}
		scanner.close();
	}
}
