package org.example.lvl1;

import java.util.Scanner;

public class GoalsOfVictory {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();
            int sum = 0;

            for(int i = 0 ; i < n-1 ;i++){

                int val = sc.nextInt();
                sum += val;

            }
            System.out.println(sum*-1);


        }

    }
}
