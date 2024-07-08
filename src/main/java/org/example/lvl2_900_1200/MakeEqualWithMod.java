package org.example.lvl2_900_1200;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MakeEqualWithMod {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) solveT(sc);
        sc.close();



    }
    public static void solveT(Scanner sc){


        int n = sc.nextInt();

        int[] nums = new int[n];

        int freq = 0;

        for(int i = 0 ; i < n ; i++){
           nums[i] = sc.nextInt();
           if(nums[i] ==1) freq++;
        }


        int flag = 0;

        if(freq == n || freq == 0){
            System.out.println("YES");
        }else{

            Arrays.sort(nums);

            for(int i = n-1 ; i >= 1 ; i--){

                if(nums[i] - nums[i-1] == 1){
                    flag = 1;
                    System.out.println("NO");
                    break;
                }
            }

            if(flag == 0)System.out.println("YES");

        }



    }
}
