package org.example.bit;

import java.util.Scanner;

public class BinaryCafe {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            long n = sc.nextLong();
            long k = sc.nextLong();

            long idx = -1;
            long temp = 0;
            for (int i = 0; i < k; i++) {

                temp += (1L << i);

                if (n < temp) {
                    temp -= (1L << i);
                    idx = i;
                    break;
                }

            }

            System.out.println((idx == -1) ? (1L << k) : (1L << idx) + (n - temp));
        }

        sc.close();
    }
}
