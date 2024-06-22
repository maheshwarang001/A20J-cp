package org.example.bit;

import java.util.Iterator;
import java.util.Scanner;

public class MrPerfectlyFine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[][] arr = new int[n][2];

            int single = Integer.MAX_VALUE;
            int minA = Integer.MAX_VALUE;
            int minB = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = Integer.parseInt(sc.next());


                if ((arr[i][1] & 1) != 0 && (arr[i][1] & (1 << 1)) != 0) {
                    single = Math.min(single, arr[i][0]);
                } else if ((arr[i][1] & 1) != 0) {
                    minA = Math.min(minA, arr[i][0]);
                } else if ((arr[i][1] & (1 << 1)) != 0) {
                    minB = Math.min(minB, arr[i][0]);
                }
            }

            if (minB == Integer.MAX_VALUE || minA == Integer.MAX_VALUE) {
                System.out.println(single == Integer.MAX_VALUE ? -1 : single);

            } else {
                long result = Math.min(single, minA + minB);
                System.out.println(result == Integer.MAX_VALUE ? -1 : result);
            }
        }
    }
}

