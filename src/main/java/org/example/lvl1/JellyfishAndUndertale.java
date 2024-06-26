package org.example.lvl1;

import java.util.Arrays;
import java.util.Scanner;

public class JellyfishAndUndertale {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solveT(sc);
    }

    public static void solveT(Scanner sc) {
        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextInt();
            long b = sc.nextInt();
            int n = sc.nextInt();

            long count = b;
            for (int i = 0; i < n; i++) {
               count += Math.min(1 + sc.nextInt(),a) - 1;
            }

            System.out.println(count);
        }
    }
}
