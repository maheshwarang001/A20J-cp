package org.example.lvl1;

import java.util.Scanner;

public class GCDSequence {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while( t-- > 0){

            int n = sc.nextInt();

            int [] nums = new int[n];

            for(int i = 0 ; i < n ; i++){
                nums[i] = sc.nextInt();
            }

            boolean [] prefix = new boolean[n];
            boolean [] suffix = new boolean[n];
            int[] gs = new int[n];

            for(int i = 0 ; i < n-1 ; i++){
                gs[i] = gcd(nums[i],nums[i+1]);
            }




        }
    }

    public static int gcd(int num1 , int num2){
        while(num2 != 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
