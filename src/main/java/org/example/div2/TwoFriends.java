package org.example.div2;

import java.util.Arrays;
import java.util.Scanner;

public class TwoFriends {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) solveT(sc);


    }
    public static void solveT(Scanner sc){

        int n = sc.nextInt();

        int k = sc.nextInt();

        int [] nums = new int[n];


        if(n==1){
            System.out.println(k);
        }else {

            Arrays.fill(nums, 0);

            int x = 0;


            for (int i = 1; i <= 31; i++) {

                if ((k & (1 << i)) != 0) {
                    x = i;
                }
            }

            nums[0] = (1 << x) - 1;
            nums[1] = k-nums[0];

            for (int i : nums) System.out.print(i + " ");
            System.out.println();
        }


    }
}
