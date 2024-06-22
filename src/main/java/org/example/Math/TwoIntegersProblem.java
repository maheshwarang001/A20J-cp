package org.example.Math;

import java.util.Scanner;

public class TwoIntegersProblem {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);

    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0) {

            int a = sc.nextInt();

            int b = sc.nextInt();

            int ans = 0;

            if(a== b){
                System.out.println(0);
                continue;
            }

            int abs = Math.abs(b-a);

            if(abs % 10 == 0){

                ans = abs / 10;

            }
            else{
                ans = abs/10  +1;
            }
            System.out.println(ans);


        }


    }

    public static void solve(Scanner sc){



    }
}
