package org.example.Math;

import java.util.Scanner;

public class EvenOddGame {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solve(sc);

    }

    public static void solve(Scanner sc){

        int input = sc.nextInt();

        if(input % 2 == 0){
            System.out.println("Mahmoud");
        }else{
            System.out.println("Ehab");
        }

    }
}
