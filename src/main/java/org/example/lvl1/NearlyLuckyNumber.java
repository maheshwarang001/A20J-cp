package org.example.lvl1;

import java.util.Scanner;

public class NearlyLuckyNumber {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long val = sc.nextLong();

        int digits = 0;

        while(val != 0){

            long last = val % 10;

            if(last == 4 || last == 7){
                digits++;
            }
            val /= 10;
        }

        if(digits == 4 || digits == 7){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
