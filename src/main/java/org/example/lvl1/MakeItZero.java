package org.example.lvl1;

import java.util.Scanner;

public class MakeItZero {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();
            int [] nums = new int[n];

            for(int i = 0 ; i < n ; i++) nums[i] = sc.nextInt();

            if( (n&1) != 0){
                System.out.println(4);
                System.out.println( 1 + " " + n);
                System.out.println( 2 + " " + n);
                System.out.println( 1 + " " + 2);
                System.out.println( 1 + " " + 2);


            }else{
                System.out.println(2);
                System.out.println( 1 + " " + n);
                System.out.println( 1 + " " + n);
            }


        }

    }
}
