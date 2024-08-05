package org.example.div3;

import java.util.Scanner;

public class MaxScoreCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            long[] a = new long[n];
            long[] b = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }

            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextLong();
            }

            long[] dp = new long[k + 1];

            for (int i = 0; i < n; i++) {
                long ai = a[i];
                long bi = b[i];

                long maxOperations = ai / bi;

                long[] newDp = new long[k + 1];

                for (int j = 0; j <= k; j++) {
                    newDp[j] = dp[j];
                    if (j > 0) {

                        long maxOp = Math.min(maxOperations, j);
                        long totalGain = ai * maxOp - (bi * maxOp * (maxOp - 1)) / 2;

                        newDp[j] = Math.max(newDp[j], dp[j - (int)maxOp] + totalGain);
                    }
                }

                dp = newDp;
            }

            System.out.println(dp[k]);
        }

        scanner.close();
    }
}
