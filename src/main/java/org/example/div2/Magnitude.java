package org.example.div2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Magnitude {



    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) solveT(sc);

    }

    public static void solveT(Scanner sc){
        int n = sc.nextInt();


        long[] nums = new long[n];

        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextLong();
        }

        long[][] dp = new long[n][2];
        dp[0][0] = Math.abs(nums[0]);
        dp[0][1] = nums[0];

        for(int i = 1 ; i < n ; ++i){
            dp[i][0] = Math.max( Math.abs(dp[i-1][0] + nums[i]) , Math.abs(dp[i-1][1] + nums[i]));
            dp[i][1] = dp[i-1][1] + nums[i];
        }

        System.out.println(dp[n-1][0]);

    }


}
