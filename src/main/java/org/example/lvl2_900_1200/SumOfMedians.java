package org.example.lvl2_900_1200;

import java.util.Scanner;

public class SumOfMedians {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) solveT(sc);
        sc.close();



    }
    public static void solveT(Scanner sc){


        int k = sc.nextInt();
        int n = sc.nextInt();

        int [] nums = new int[n*k];

        for(int i = 0 ; i < n*k ; i++){
            nums[i] = sc.nextInt();
        }

        int mid = (k+1)/2 ;


        long sum = 0L;


        int arrays = (n*k)/k ;
        int v =0;

        for(int i = n*k-1 ; i >= 0 ; i-=k){

            System.out.println(nums[i-mid]);

            sum += nums[i-mid];

            v++;

            if(v == arrays) break;


        }
        System.out.println(sum);
    }
}
