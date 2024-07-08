package org.example.div2;

import java.util.Scanner;

public class RectangleFilling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            solveT(sc);
        }
    }

    public static void solveT(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        char[][] arr = new char[n][m];

        for (int i = 0; i < n; i++) {
            String line = sc.next();
            for (int j = 0; j < m; j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        String ans = "YES";
        if (arr[0][0] != arr[n - 1][m - 1]) {

            boolean flag = true;

            for (int i = 0; i < m - 1; i++) {
                if (arr[0][i] != arr[0][i + 1] || arr[n - 1][i] != arr[n - 1][i + 1]) {
                    flag = false;
                }
            }

            if (flag) {
                ans = "NO";
            }

            flag = true;

            for (int i = 0; i < n - 1; i++) {
                if (arr[i][0] != arr[i + 1][0] || arr[i][m - 1] != arr[i + 1][m - 1]) {
                    flag = false;
                }
            }

            if (flag) {
                ans = "NO";
            }
        }

        System.out.println(ans);
    }
}
