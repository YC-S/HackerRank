package _30_days_of_code;

import java.util.Scanner;

public class Day16_Exceptions_String_to_Integer {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		char[] arr = s.toCharArray();
		try {
			int x = Integer.parseInt(s);
			System.out.println(s);
		} catch (Exception e) {
			System.out.println("Bad String");
		}

	}
}

class MyException extends Exception {

}
