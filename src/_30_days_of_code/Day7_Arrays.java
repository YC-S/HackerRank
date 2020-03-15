package _30_days_of_code;

import java.util.Scanner;

public class Day7_Arrays {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		for (int i = n - 1; i >= 0; i--) {
			System.out.printf("%d ", arr[i]);
		}
		scanner.close();
	}
}
