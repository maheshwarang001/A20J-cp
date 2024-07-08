package org.example.div2;

import java.util.Scanner;

public class CardExchange {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) solveT(sc);


    }
    public static void solveT(Scanner sc){


        int n = sc.nextInt();

        int k  = sc.nextInt();

        int [] nums = new int[102];

        int max = 0;

        for(int i = 0 ; i < n ; i++)
        {
            int v  = sc.nextInt();
            nums[v]++;
            max = Math.max(max, nums[v]);
        }

        if(max < k){
            System.out.println(n);
        }else{
            System.out.println(k-1);
        }
    }
}
