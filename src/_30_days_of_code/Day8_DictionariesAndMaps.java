package _30_days_of_code;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8_DictionariesAndMaps {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = Integer.parseInt(scanner.nextLine());
		Map<String, String> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String[] strArray = scanner.nextLine().split(" ");
			map.put(strArray[0], strArray[1]);
		}
		for (int i = 0; i < n; i++) {
			String s = scanner.nextLine();
			if (map.containsKey(s)) {
				System.out.printf("%s=%s\n", s, map.get(s));
			} else {
				System.out.println("Not Found");
			}
		}

	}
}
