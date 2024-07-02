package org.example.div2;

import java.util.Scanner;

public class EarningOnBets {

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

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();

            int [] nums = new int[n];

            for(int i = 0 ; i  < n; i++){
                nums[i] = sc.nextInt();
            }

            int lcm = 1;
            int sum = 0;
            for(int i = 0 ; i < n ; i++){
                lcm = (int) lcm(lcm,nums[i]);
            }
            int [] ans = new int[n];
            int min = (int)1e9;
            for(int i = 0 ; i < n ; i++ ){
                ans[i] = lcm/nums[i];
                sum += ans[i];
                min = Math.min(min,ans[i] * nums[i]);
            }
            if(sum < min){
                for (int i : ans){
                    System.out.print(i + " ");
                }
                System.out.println();
            }else{
                System.out.println(-1);
            }


        }

    }
}
