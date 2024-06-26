package org.example.lvl1;

import java.util.Scanner;

public class LineTrip {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

           int n = sc.nextInt();
           int x = sc.nextInt();

           int j = 0;
           int max =0;

           for(int i = 0 ; i < n ; i++){
               int val = sc.nextInt();
               max = Math.max(max, val - j );
               j = val;
           }

           max = Math.max( max, 2 * (x - j) );

            System.out.println(max);


        }

    }
}
