package twitter_oa;

import java.util.List;

public class Activate_Fountain {
  public static int numFountains(List<Integer> a) {
    int n = a.size();
    int[] extents = new int[n + 1];

    for (int i = 0; i < n; i++) {
      int left = Math.max(i - a.get(i), 0);
      int right = Math.min(i + (a.get(i) + 1), n);
      extents[left] = Math.max(extents[left], right);
    }

    int num_fountains = 1;
    int right = extents[0], next_right = 0;
    for (int i = 0; i < n; i++) {
      next_right = Math.max(next_right, extents[i]);
      if (i == right) {
        num_fountains++;
        right = next_right;
      }
    }

    return num_fountains;
  }
}
