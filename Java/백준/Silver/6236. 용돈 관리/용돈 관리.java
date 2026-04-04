import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] arr = new int[n];
    int answer = 0;
    int right = 0;

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
      right += arr[i];
    }

    int left = Arrays.stream(arr).max().getAsInt();

    while (left <= right) {
      int mid = (left + right) / 2;

      if (canUse(mid, arr, m)) {
        answer = mid;
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }

    System.out.println(answer);
  }

  private static boolean canUse(int mid, int[] arr, int m) {
    int count = 1;
    int remain = mid - arr[0];

    for (int i = 1; i < arr.length; i++) {
      if (remain >= arr[i]) {
        remain -= arr[i];
      } else {
        count++;
        remain = mid - arr[i];
      }
    }

    return count <= m;
  }
}