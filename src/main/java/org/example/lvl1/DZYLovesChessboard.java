package org.example.lvl1;

import java.util.Scanner;

public class DZYLovesChessboard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        String[][] chess = new String[n][m];

        for (int i = 0; i < n; i++) {
            String str = sc.next();
            for (int j = 0; j < m; j++) {
                chess[i][j] = String.valueOf(str.charAt(j));

                if (chess[i][j].equals(".")) {
                    if ((i + j) % 2 == 0) {
                        chess[i][j] = "B";
                    } else {
                        chess[i][j] = "W";
                    }
                }
            }
        }
        sc.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(chess[i][j]);
            }
            System.out.println();
        }
    }
}
