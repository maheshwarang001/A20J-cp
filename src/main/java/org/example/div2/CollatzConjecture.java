package org.example.div2;

import java.util.Scanner;

public class CollatzConjecture {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solveT(sc);
    }

    public static void solveT(Scanner sc) {
        int t = sc.nextInt();

        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long k = sc.nextLong();


            long req = y - (x % y);
            if (k < req) {
                System.out.println(x + k);
            } else {
                while(x != 1 && k > 0) {
                    req = y - (x % y);
                    if (k < req) {
                        System.out.println(x + k);
                    }else {
                        k -= req;
                        x += req;
                        while (x % y == 0 && k > 0) {
                            x /= y;
                        }
                    }
                }
                System.out.println(x + (k % (y - 1)));
            }
        }
    }
}
