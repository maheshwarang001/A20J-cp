package org.example.div2;

import java.util.Scanner;

public class CollatzConjecture {



    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            long x = sc.nextLong();
            long y = sc.nextLong();
            long k = sc.nextLong();

            while(k-- > 0){
                x += 1;
                while(x%y == 0) x = x / y;
            }
            System.out.println(x);
        }

    }
}
