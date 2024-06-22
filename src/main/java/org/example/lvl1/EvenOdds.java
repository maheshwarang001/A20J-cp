package org.example.lvl1;

import java.util.Scanner;

public class EvenOdds {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long k = sc.nextLong();

        long index = 0;

        //odds
        if(k <= (n + 1) /2 ){

            index = k * 2 - 1;
        }else{
            index = (k- (n+1)/2)*2;
        }
        System.out.println(index);
    }
}
