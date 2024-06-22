package org.example.Math;

import java.util.Scanner;

public class Candies {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            long n = sc.nextLong();

            for (int i = 2; i <= 31; i++) {

                long c = (long) Math.pow(2, i) - 1;

                if (n % c == 0) {
                    System.out.println(n / c);
                    break;
                }
            }
        }
    }
}
