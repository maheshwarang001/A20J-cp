package org.example.div2;

import java.util.Scanner;

public class BasilGarden {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

           int n  = sc.nextInt();
           long [] nums = new long[n];


           for(int i = 0 ; i < n ; i++){
               nums[i] = sc.nextLong();
           }


           long max = 0;
           for(int i = 0 ; i<n ; i++){
               max = Math.max(max, nums[i] + i);
           }
           System.out.println(max);


        }

    }
}
