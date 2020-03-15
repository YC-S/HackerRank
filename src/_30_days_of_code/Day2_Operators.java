package _30_days_of_code;

import java.util.Scanner;

public class Day2_Operators {

  private static final Scanner sc = new Scanner(System.in);

  public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    int totalCost = (int) Math.round((meal_cost + meal_cost * (double)tip_percent / 100 + meal_cost * (double)(tax_percent) / 100));
    System.out.println(Math.round(totalCost));
  }

  public static void main(String[] args) {
    double mealCost = sc.nextDouble();
    int tipPercent = sc.nextInt();
    int taxPercent = sc.nextInt();
    solve(mealCost, tipPercent, taxPercent);
  }

}
