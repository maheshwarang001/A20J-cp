package org.example.striver;

import java.util.Arrays;
import java.util.Scanner;

public class IchihimeAndTriangle {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solve(sc);

    }

    public static void solve(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            long[] nums = new long[4];

            for(int i = 0 ; i < 4 ; i++){
                nums[i] = sc.nextLong();
            }

            System.out.println(nums[1] + " " + nums[2] + " " + nums[2]);



        }
    }
}
