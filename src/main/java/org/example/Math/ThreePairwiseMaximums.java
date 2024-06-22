package org.example.Math;

import java.util.Arrays;
import java.util.Scanner;

public class ThreePairwiseMaximums {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solve(sc);

    }

    public static void solve(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            long[] nums = new long[3];

            for(int i = 0 ; i < 3 ; i++) nums[i] = sc.nextLong();

            Arrays.sort(nums);

            if(nums[2] != nums[1]){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
                nums[2] = 1;
                for(int i = 0 ; i < 3 ; i++) System.out.print(nums[i] + " ");
                System.out.println();
            }

        }

    }
}
