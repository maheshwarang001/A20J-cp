package org.example.lvl1;

import java.util.Scanner;

public class LongestDivisorsInterval {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            long x = sc.nextLong();

            if(x == 1 || x == 2) System.out.println(x);
            else
                for(long i = 1 ; i <= x ; i++){
                    if(x%i != 0){
                        System.out.println(i-1L);
                        break;
                    }
                }




        }

    }
}
