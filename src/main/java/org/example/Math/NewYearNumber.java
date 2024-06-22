package org.example.Math;

import java.util.Scanner;

public class NewYearNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();;

        while (t-- > 0) {

            int val = sc.nextInt();

            while (val % 2021 != 0){

                if(val % 2020 == 0){

                    System.out.println("YES");
                    break;
                }
                val -= 2020;

                if( val < 2021){
                    System.out.println("NO");
                    break;
                }
            }
            if(val % 2021 == 0) System.out.println("YES");
        }
    }
}
