package org.example.lvl1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EffectiveApproach {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        Map<Integer,Integer> map = new HashMap<>();



        for (int i = 1; i <= n; i++) {
            map.put(sc.nextInt(), i);
        }


        int q = sc.nextInt();
        int[] queries = new int[q];


        for (int i = 0; i < q; i++) {
            queries[i] = sc.nextInt();
        }

        long a1 = 0;
        long b1 = 0;

        for (int query : queries) {
            int index = map.get(query);
            a1 += index;
            b1 += n + 1 - index;
        }

        System.out.println(a1 + " " + b1);
    }
}
