package org.example.lvl1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PashmakAndFlowers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] nums = new long[n];
        long min = (long) 1e9 + 1;
        long max = -(long) 1e9 - 1;

        Map<Long, Long> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);

            map.put(nums[i], map.getOrDefault(nums[i], 0L) + 1);
        }

        if (min == max) {
            long count = ((long) n * (n - 1)) / 2;
            System.out.println("0 " + count);
        } else {
            long count = map.get(min) * map.get(max);
            System.out.println(max - min + " " + count);
        }
    }
}
