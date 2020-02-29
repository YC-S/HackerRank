package interview_prep.array;

import java.util.Arrays;

public class LeftRotation {
  public static int[] rotLeft(int[] a, int d) {
    int[] res = new int[a.length];
    int reminder = d % a.length;
    for (int i = 0; i < res.length - reminder; i++) {
      res[i] = a[i + reminder];
    }
    for (int i = res.length - reminder; i < res.length; i++) {
      res[i] = a[i - res.length + reminder];
    }
    return res;
  }

  public static void main(String[] args) {
    int[] a = new int[] {1, 2, 3, 4, 5};
    System.out.println(Arrays.toString(rotLeft(a, 4)));
  }
}
