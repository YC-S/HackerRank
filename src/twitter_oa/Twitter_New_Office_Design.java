package twitter_oa;

import java.util.List;

public class Twitter_New_Office_Design {
  public static int calculateHeight(int dist, int height1, int height2) {
    int minH = Math.min(height1, height2);
    int maxH = Math.max(height1, height2);

    if (dist == 0) return 0;
    if (dist == 1) return minH + 1;

    // if both heights are same then meet in middle
    if (minH == maxH) {
      int add = (dist % 2 == 0) ? dist / 2 : dist / 2 + 1;
      return minH + add;
    }

    // See if we can make the height same
    int delta = maxH - minH;
    if (delta < dist) {
      dist -= delta;
      minH += delta;
      int add = (dist % 2 == 0) ? dist / 2 : dist / 2 + 1;
      return minH + add;
    }

    // for all cases where delta >= dist
    return minH + dist;
  }

  public static int getMaxHeight(List<Integer> tablePositions, List<Integer> tableHeights) {
    if (tablePositions.isEmpty()
        || tableHeights.isEmpty()
        || tablePositions.size() != tableHeights.size()) {
      return 0;
    }

    int result = 0;
    for (int i = 1; i < tablePositions.size(); ++i) {
      int currMax =
          calculateHeight(
              tablePositions.get(i) - tablePositions.get(i - 1) - 1,
              tableHeights.get(i),
              tableHeights.get(i - 1));
      result = Math.max(result, currMax);
    }
    return result;
  }

  public static void main(String[] args) {

  }
}
