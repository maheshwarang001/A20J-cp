package org.example.div2;

import java.util.Scanner;

public class TurtleAndAnInfiniteSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            solveT(sc);
        }

        sc.close();
    }

    public static void solveT(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int l = Math.max(0 ,n-m);
        int r = m + n;

        int ans = 0;
        for (int i = 30; i >= 0; i--) {
            if ((l & (1 << i)) != 0 ||   (r & (1 << i)) != 0 || (l>>(i+1))!=(r>>(i+1)) ) {
                ans  |= (1 << i);
            }
        }
        System.out.println(ans);
    }
}
