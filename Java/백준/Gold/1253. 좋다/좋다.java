import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];
    int answer = 0;

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    Arrays.sort(arr);

    for (int i = 0; i < n; i++) {
      int target = arr[i];
      int left = 0;
      int right = n - 1;

      while (left < right) {
        if (i == left) {
          left++;
          continue;
        }
        if (i == right) {
          right--;
          continue;
        }

        int sum = arr[left] + arr[right];
        if (sum == target) {
          answer++;
          break;
        } else if (sum < target) {
          left++;
        } else {
          right--;
        }
      }
    }

    System.out.println(answer);
  }
}