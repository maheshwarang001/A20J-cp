package org.example.div2;

import java.util.Scanner;

public class KSort {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

           int n = sc.nextInt();

           long[] a =new long[n];

           for(int i = 0 ; i  < n ; i++){
               a[i] = sc.nextInt();
           }

           long coins = 0;
           long max = 0;

           for(int i = 1 ; i< n ; i++){

               if(a[i] < a[i-1]){

                       coins += a[i-1] - a[i];
                       max = Math.max(max, a[i-1] - a[i]);
                       a[i] = a[i-1] ;
                   }
               }
           coins += max;
           System.out.println(coins);
        }

    }
}
