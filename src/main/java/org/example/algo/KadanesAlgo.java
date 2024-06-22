package org.example.algo;

import java.util.Scanner;

public class KadanesAlgo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }


        int max_all = nums[0];
        int max_here = nums[0];

        for (int i = 1; i < nums.length; i++) {
            max_here = Math.max(nums[i], max_here + nums[i]);
            max_all = Math.max(max_all, max_here);
        }

        System.out.println(max_all);
    }
}
