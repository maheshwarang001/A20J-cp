package org.example.numberTheory;

import java.util.Scanner;

public class FastThreeTask {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();

            int sum = 0;
            int rem1= 0;
            int rem2 = 0;
            int steps=0;

            for(int i = 0 ; i < n ; i++){
                int val = sc.nextInt();

                if(val % 3 == 1){
                    rem1 = val;
                }
                if( val % 3 == 2){
                    rem2 = val;
                }
                sum += val;
            }

            if(sum % 3 == 0){
                steps=0;
            }else

                if(sum-rem1 % 3 == 0 || sum-rem2 % 3 == 0){
                    steps = 1;
                }
            else if(sum % 3 == 1){
                steps = 2;
            }

            System.out.println(steps);

        }

    }

    public static void solve(Scanner sc){



    }
}
