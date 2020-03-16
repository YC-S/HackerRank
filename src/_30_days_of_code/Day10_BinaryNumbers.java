package _30_days_of_code;

import java.util.Scanner;

public class Day10_BinaryNumbers {
	private static Scanner scanner = new Scanner(System.in);

	private static int countOne(int n) {
		int maxCount = 0;
		int curCount = 0;
		while (n != 0) {
			int cur = n & 1;
			if (cur == 1) {
				curCount++;
				maxCount = Math.max(maxCount, curCount);
			} else {
				curCount = 0;
			}
			n >>= 1;
		}
		return maxCount;
	}
	public static void main(String[] args) {
		int n = scanner.nextInt();
		System.out.println(countOne(n));
	}

}
