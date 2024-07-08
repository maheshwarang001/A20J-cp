package org.example.div2;

import java.util.Scanner;

public class StrangeSplitting {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) solveT(sc);


    }
    public static void solveT(Scanner sc){


        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }

        if(nums[0] == nums[n-1]){
            System.out.println("NO");
        }else{
            System.out.println("YES");

            for(int i = 0 ; i < n; i++){

                if(i==1)System.out.print('R');
                else System.out.print('B');
            }

            System.out.println();
        }



    }
}
