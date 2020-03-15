package _30_days_of_code;

import java.util.Scanner;

public class Day6_Let_sReview {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = Integer.parseInt(scanner.nextLine());
		for (int i = 0; i < n; i++) {
			String str = scanner.nextLine();
			for (int j = 0; j < str.length(); j+=2) {
				System.out.printf("%s", str.charAt(j));
			}
			System.out.print(" ");
			for (int j = 1; j < str.length(); j+=2) {
				System.out.printf("%s", str.charAt(j));
			}
			System.out.println();
		}
	}
}
