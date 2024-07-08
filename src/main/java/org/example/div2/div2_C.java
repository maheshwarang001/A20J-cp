package org.example.div2;

import java.util.Scanner;

public class div2_C {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) solveT(sc);


    }
    public static void solveT(Scanner sc){


        int n = sc.nextInt();

        long[] nums =  new long[n];
        long lcm = 1;
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
            lcm = lcm(lcm,nums[i]);
        }
        long ans = 0;
        long sum = 0;
        long min = Long.MAX_VALUE;
        for(int i = 0 ; i < n ; i++){

            ans = lcm/nums[i];
            sum += ans;
            min = Math.min(min, ans * nums[i]);
        }
        if(sum <  min){
            //System.out.println("YES");
            for(int i = 0 ;i < n ;i++){
                System.out.print(lcm/nums[i]+ " ");
            }
            System.out.println();
        }else{
            System.out.println(-1);
        }







    }

    public static long lcm(long a, long b){
        return Math.abs((a*b))/gcd(a,b);
    }
    public static long gcd(long a , long b){
        while(b != 0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }



}
