package org.example.lvl1;

import java.util.Arrays;
import java.util.Scanner;

public class Swaps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solveT(sc);
    }

    public static void solveT(Scanner sc) {
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            boolean flag = false;

            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();

            }
            System.out.println( nums[0] == 1 ? "YES" : "NO");


        }
    }
}
