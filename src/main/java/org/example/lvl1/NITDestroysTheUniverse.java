package org.example.lvl1;

import java.util.Scanner;

public class NITDestroysTheUniverse {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            int n  = sc.nextInt();

            int[] nums = new int[n+1];

            int zeroes = 0;

            for(int i = 1 ; i <= n ; i++){
                nums[i] = sc.nextInt();
                if(nums[i-1] == 0 && nums[i] != 0) zeroes++;
            }

            System.out.println(Math.min(zeroes,2));

        }

    }

}
