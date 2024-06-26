package org.example.numberTheory;

import java.util.Scanner;

public class AssemblyViaRemainders {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();

            int max = 0;

            int[] nums = new int[n];

            for(int i = 1 ; i < n ; i++){
                nums[i] = sc.nextInt();
                max = Math.max(max,nums[i]);
            }
            max = max+1;

            for(int i = 0 ; i < n ; i++){
                if(i == 0 ){
                    System.out.print(max + " ");
                }
                else{
                    max += nums[i];
                    System.out.print( max + " ");
                }

            }
            System.out.println();



        }

    }

    public static void solve(Scanner sc){



    }
}
