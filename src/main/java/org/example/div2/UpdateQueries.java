package org.example.div2;

import java.util.*;

public class UpdateQueries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solveT(sc);
    }

    public static void solveT(Scanner sc) {
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            String a = sc.next();
            Set<Integer> set = new TreeSet<>();

            for (int i = 0; i < m; i++) {
                set.add(sc.nextInt() - 1);
            }

            String b = sc.next();

            char[] ch = b.toCharArray();
            Arrays.sort(ch);

            char[] imp = a.toCharArray();
            int idx = 0;

            for (int i : set) {
                imp[i] = ch[idx++];
            }

            String ans = new String(imp);
            System.out.println(ans);
        }
    }
}
