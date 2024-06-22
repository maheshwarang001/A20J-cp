package org.example.bit;

import java.util.Scanner;

public class SumBig {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            long n = sc.nextLong();
            long k = sc.nextLong();

            System.out.println((long)Math.pow(n,k) );

        }

        sc.close();
    }
}
