package org.example.div2;

import java.util.Scanner;

public class CatchTheCoin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] coins = new int[n][2];

        for (int i = 0; i < n; i++) {
            coins[i][0] = sc.nextInt();
            coins[i][1] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int x = coins[i][0];
            int y = coins[i][1];


           if(y >= 0 || y-1 >= 0 || y == -1){
               System.out.println("YES");
           }else{
               System.out.println("NO");
           }
        }

        sc.close();
    }
}
