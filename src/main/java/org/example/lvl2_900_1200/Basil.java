package org.example.lvl2_900_1200;

import java.util.Scanner;

public class Basil {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) solveT(sc);
        sc.close();



    }
    public static void solveT(Scanner sc){

        int n = sc.nextInt();

        long max = 0;

        for(int i = 0 ; i < n ; i++){

            max = Math.max(max, sc.nextInt() + i);
        }

        System.out.println(max);

    }
}
