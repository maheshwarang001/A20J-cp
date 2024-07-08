package org.example.div2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BessieAndMEX {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) solveT(sc);


    }
    public static void solveT(Scanner sc){

        int n = sc.nextInt();

        int[] nums = new int [n];

        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = sc.nextInt();
        }

        int mex = 0;
        Set<Integer> set = new HashSet<>();

        for(int i = 0 ; i < n ; i++){

            int pi = 0;

            if(nums[i] >= 0){
                pi = mex;
            }else{
                pi = mex - nums[i];
            }
            System.out.print(pi+ " ");
            set.add(pi);

            while(set.contains(mex))mex++;
        }
        System.out.println();

    }
}
