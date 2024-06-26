package org.example.numberTheory;

import java.util.Scanner;

public class GameWithIntegers {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            int m = sc.nextInt();

            if(m % 3 != 0 ){
                System.out.println("First");
            }else{
                System.out.println("Second");
            }

        }

    }
}
