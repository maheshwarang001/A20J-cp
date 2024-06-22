package org.example.lvl1;

import java.util.Scanner;

public class Reconnaissance2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }

        String pair = "";

        int min = (int) 1e5;

        for(int i = 1 ; i < n ; i++){
            if(min > Math.abs(nums[i-1] - nums[i])){
                min = Math.abs(nums[i-1] - nums[i]);
                int a = i;
                int b = i+1;

                pair = a + " " + b;
            }
        }

        if(min > Math.abs(nums[0] - nums[n-1])){
            int a = 1;
            int b = n;
            pair = a + " " + b;
        }

        System.out.println(pair);
    }
}
