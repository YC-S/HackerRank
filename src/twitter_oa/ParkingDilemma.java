package twitter_oa;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ParkingDilemma {
  public static long carParkingRoof(List<Long> cars, int k) {
    long res = Long.MAX_VALUE;
    int n = cars.size();
    Collections.sort(cars);
    for (int i = 0; i < n - k + 1; i++) {
      res = (long)(Math.min(res, cars.get(i + k - 1) - cars.get(i) + 1));
    }
    return res;
  }
}
