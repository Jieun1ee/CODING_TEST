import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] dp = new int[15][15];

        for (int i = 0; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                }
                else if (j == 1) {
                    dp[i][j] = 1;
                }
                else {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                }
            }
        }

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();

            System.out.println(dp[k][n]);
        }
    }
}