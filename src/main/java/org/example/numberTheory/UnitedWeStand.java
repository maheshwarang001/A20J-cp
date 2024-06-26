package org.example.numberTheory;

import java.util.Scanner;

public class UnitedWeStand {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();

            int evenCount = 0;

            int[] nums = new int[n];

            for(int i = 0 ; i < n ; i++){
                nums[i] = sc.nextInt();

                if(nums[i] % 2 ==0 ) evenCount++;
            }

            if(evenCount == n) {
                System.out.println(-1);
            }







        }

    }
}
