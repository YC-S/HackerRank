package _30_days_of_code;

import java.util.Scanner;

public class Day1_DataTypes {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = Integer.parseInt(scan.nextLine());
    double b = Double.parseDouble(scan.nextLine());
    String str = scan.nextLine();
    int i = 4;
    double d = 4.0;
    String s = "HackerRank ";
    System.out.println(a + i);
    System.out.println(b + d);
    System.out.println(s + str);
  }
}