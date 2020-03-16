package _30_days_of_code;

import java.util.Scanner;

public class Day11_2D_Arrays {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] matrix = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		int max = Integer.MIN_VALUE;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				int cur =
					matrix[i][j] + matrix[i - 1][j] + matrix[i - 1][j - 1]
						+ matrix[i - 1][j + 1] + matrix[i + 1][j]
						+ matrix[i + 1][j - 1] + matrix[i + 1][j + 1];
				max = Math.max(cur, max);
			}
		}
		System.out.println(max);
		scanner.close();
	}
}
