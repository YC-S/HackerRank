package interview_prep.array;

public class MinimumSwaps2 {
  static int minimumSwaps(int[] arr) {
    int res = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] != i + 1) {
        int x = findIndex(arr, i + 1);
        swap(arr, i, x);
        res++;
      } else {
        continue;
      }
    }
    return res;
  }

  static int findIndex(int[] arr, int x) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        return i;
      }
    }
    return -1;
  }

  static void swap(int[] array, int a, int b) {
    int tmp = array[a];
    array[a] = array[b];
    array[b] = tmp;
  }

  public static void main(String[] args) {
    int[] arr = new int[] {3, 2, 1, 4, 5};
    System.out.println(minimumSwaps(arr));
  }
}
