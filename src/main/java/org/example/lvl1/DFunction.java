package org.example.lvl1;

import java.util.Scanner;

public class DFunction {

    static int MOD = (int) (1e9 + 7);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int l = sc.nextInt();
            int r = sc.nextInt();
            int k = sc.nextInt();

            long nums = 0;
            for (int i = 1; i <= 9; i++) {
                if (k * i < 10) {
                    nums = i;
                }
            }

            long ans = (power(nums + 1, r) - power(nums + 1, l - 1) + MOD) % MOD;
            System.out.println(ans);
        }
    }

    static long power(long x, long y) {
        if (y == 0) return 1;

        long res = 1;
        long base = x % MOD;

        while (y > 0) {
            if ((y & 1) == 1) {
                res = (res * base) % MOD;
            }
            y >>= 1;
            base = (base * base) % MOD;
        }
        return res;
    }
}
