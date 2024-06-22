package org.example.div2;

import java.util.Scanner;

public class Div2_953B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();


            int maxK = Math.min(n, b);


            long profit0 = (long) n * a;


            long sumK = (long) maxK * b - (long) maxK * (maxK - 1) / 2;
            long profitMaxK = sumK + (long) (n - maxK) * a;

            long maxProfit = Math.max(profit0, profitMaxK);

            System.out.println(maxProfit);
        }

        sc.close();
    }
}
