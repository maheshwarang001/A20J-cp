package org.example.numberTheory;

import java.util.Arrays;
import java.util.Scanner;

public class HalloumiBoxes {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int flag = 0;
            int nums [] = new int[n];
            for(int i =0 ; i  < n ; i++){
                nums[i] = sc.nextInt();
                if(i >= 1 ){
                    if(nums[i] < nums[i-1]) flag = 1;
                }
            }

            if(flag  == 0 || k > 1){
                System.out.println("YES");

            }
            else{
                System.out.println("NO");
            }
        }

    }
}
