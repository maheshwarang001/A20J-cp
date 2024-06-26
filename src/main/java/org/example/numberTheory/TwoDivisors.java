package org.example.numberTheory;

import java.util.Scanner;

public class TwoDivisors {

    public static long gcd(long a , long b){
        if(b == 0) return a;
        return gcd(b,a%b);
    }

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            long a = sc.nextLong();
            long b = sc.nextLong();
            long ans = 0;
            if(b % a == 0){
                ans = a*b/gcd(a,b) * b/a;
            }else{
                ans = a*b/gcd(a,b);
            }


            System.out.println(ans);


        }

    }

    public static void solve(Scanner sc){




    }
}
