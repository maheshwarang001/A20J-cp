package org.example.math;

import java.util.Scanner;

public class MakeAP {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = 3;
            int[] arr = new int[n];

            for (int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();
            }

            boolean found = false;

            int res = 2 * arr[1] - arr[2];
            if (res > 0 && res % arr[0] == 0) {
                found = true;
            }

            res = arr[0] + arr[2];
            if (res % 2 == 0 && (res / 2) % arr[1] == 0) {
                found = true;
            }

            res = 2 * arr[1] - arr[0];
            if (res > 0 && res % arr[2] == 0) {
                found = true;
            }

            if (found) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
