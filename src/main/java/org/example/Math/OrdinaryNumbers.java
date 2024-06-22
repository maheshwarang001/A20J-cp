package org.example.Math;

import java.util.Scanner;

public class OrdinaryNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while( t-- > 0){

            long n = sc.nextInt();

            int count = 0;
            long start = 0L;

            for(int i = 1 ; i  <= 9 ; i++){

                start = i;

                while( start <= n){

                    count++;
                    start = start * 10 + i;
                }
            }
            System.out.println(count);
        }
    }
}
