package org.example.div2;

import java.util.*;

public class BinaryColouring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solveT(sc);
    }

    public static void solveT(Scanner sc) {
        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            List<Integer> v = new ArrayList<>();

            for (; x != 0; ) {
                v.add(x & 1);
                x = x >> 1;

            }

            for (int i = 0; i < v.size(); i++) {
                int b = v.get(i);

                if (b == 1) {
                    int j = i + 1;
                    while (j < v.size()) {
                        int c = v.get(j);
                        if (c == 0) break;
                        v.set(j, 0);
                        j++;
                    }

                    if (j != i + 1) {
                        v.set(i, -1);

                        if (j == v.size()) v.add(1);
                        else v.set(j, 1);
                    }

                    i = j - 1;
                }
            }

            System.out.println(v.size());

            for (int i : v) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
