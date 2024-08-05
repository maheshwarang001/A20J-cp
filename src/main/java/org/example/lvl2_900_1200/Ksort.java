package org.example.lvl2_900_1200;

import java.util.Scanner;

public class Ksort {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) solveT(sc);
        sc.close();



    }
    public static void solveT(Scanner sc){

        int n = sc.nextInt();

        long nums[] = new long[n];


        long coins = 0L;
        long maxK = 0;

        for(int i = 0 ; i < n ;i++){
            nums[i] = sc.nextLong();
        }


        for(int i = 1; i < n ; i++){

            if(nums[i] < nums[i-1]){

                coins += nums[i-1] - nums[i];
                maxK = Math.max(maxK,nums[i-1] - nums[i] );
                nums[i] = nums[i-1];
            }
        }


        coins += maxK;

        System.out.println(coins);

    }
}
