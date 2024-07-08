package org.example.div2;

import java.util.Scanner;

public class MakeItUgly {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) solveT(sc);


    }
    public static void solveT(Scanner sc){

        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i = 0  ; i < n ; i++){
            nums[i] = sc.nextInt();
        }


        int min = (int)1e9;

        int l = -1;

        for(int i = 1 ; i  < n-1 ; i++){

            if(nums[0] != nums[i]) {
                min = Math.min(min, (i-l-1));
                l = i;
            }
        }
        min = Math.min (min,n-l-1);

        if(min == n)min = -1;


        System.out.println(min);


    }
}
