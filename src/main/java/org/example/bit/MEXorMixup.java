package org.example.bit;

import java.util.Scanner;

public class MEXorMixup {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int maxN = 3 * (int) 1e5;
        int[] xor = new int[maxN + 1];

        // Precompute XOR from 0 to i
        for (int i = 1; i <= maxN; i++) {
            xor[i] = xor[i - 1] ^ i;
        }

        // Process each test case
        while (t-- > 0) {
            solve(sc, xor);
        }

        sc.close();
    }

    public static void solve(Scanner sc, int[] xor) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = b ^ xor[a - 1];

        if (ans == 0) {
            System.out.println(a);
        } else if (ans == a) {
            System.out.println(a + 2);
        } else {
            System.out.println(a + 1);
        }
    }
}
