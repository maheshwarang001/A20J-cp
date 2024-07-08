package org.example.div2;

import java.util.Scanner;

public class DualTrigger {

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
        String str = sc.next();
        char[] ch = str.toCharArray();

        int count = 0;

        int mi = (int)1e9;
        int mx = 0;

        for (int i = 0; i < n; i++) {
            if (ch[i] == '1') {
                count++;
                mi = Math.min(mi, i);
                mx = Math.max(mx, i);
            }
        }

        if((count %2 ) == 1 || mx-mi == 1){
            System.out.println("NO");
        }else System.out.println("YES");

    }
}
