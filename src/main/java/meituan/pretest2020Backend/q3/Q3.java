package meituan.pretest2020Backend.q3;

import java.util.Scanner;

public class Q3 {
    public static long minCost(int[] coins) {
        int[][] dp = new int[coins.length][coins.length];
        int[] sum = new int[coins.length+1];
        sum[0] = 0;
        for (int i = 1; i <= coins.length; i++) {
            sum[i]=sum[i-1]+coins[i-1];
        }

        for (int i = 0; i < coins.length; i++) {
            dp[i][i] = 0;
        }
        for (int len = 1; len < coins.length; len++) {
            for (int from = 0; from + len < coins.length; from++) {
                dp[from][from + len] = Integer.MAX_VALUE;
                for (int split = from; split < from + len; split++) {
                    dp[from][from + len] = Math.min(
                            dp[from][from + len],
                            dp[from][split] + dp[split + 1][from + len]+(sum[split+1]-sum[from])+(sum[from+len+1]-sum[split+1])
                    );
                }
            }
        }

        return dp[0][coins.length - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] coins = new int[N];
        for (int i = 0; i < N; i++) {
            coins[i] = scanner.nextInt();
        }

        System.out.println(minCost(coins));
    }
}
