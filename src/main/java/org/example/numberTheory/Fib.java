package org.example.numberTheory;

import java.util.Scanner;

public class Fib {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int ans = fib(sc.nextInt());
        System.out.println(ans);

    }

    public static int fib(int n){

        int [][] F = new int[][]{{1,1},{1,0}};

        if(n == 0) return 0;

        power(F,n);
        return F[0][0];

    }
    public static void power(int[][] F, int n){
        if(n == 0 || n == 1)return;

        int M[][] = new int[][] { { 1, 1 }, { 1, 0 } };

        power(F,n/2);
        multiply(F,F);
        if(n % 2 != 0){
            multiply(F,M);
        }


    }
    static void multiply(int F[][], int M[][])
    {
        int x = F[0][0] * M[0][0] + F[0][1] * M[1][0];
        int y = F[0][0] * M[0][1] + F[0][1] * M[1][1];
        int z = F[1][0] * M[0][0] + F[1][1] * M[1][0];
        int w = F[1][0] * M[0][1] + F[1][1] * M[1][1];

        F[0][0] = x;
        F[0][1] = y;
        F[1][0] = z;
        F[1][1] = w;
    }
}
