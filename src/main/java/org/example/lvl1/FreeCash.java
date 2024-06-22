package org.example.lvl1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FreeCash {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Map<String,Integer> map = new HashMap<>();

        for(int i = 0 ; i< n ; i++){

            int h = sc.nextInt();
            int m = sc.nextInt();

            String time = String.format("%02d:%02d", h, m);

            map.put(time, map.getOrDefault(time, 0) + 1);

        }

        int max = 0;

        for (int count : map.values()) {
            max = Math.max(max, count);
        }

        System.out.println(max);
    }
}
