package org.example.Math;

import java.util.Scanner;

public class Stick {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);

    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            long in = sc.nextLong();

            long ans = (int) Math.ceil((double) in/2);
            System.out.println(ans);
        }

    }

    public static void solve(Scanner sc){



    }
}
