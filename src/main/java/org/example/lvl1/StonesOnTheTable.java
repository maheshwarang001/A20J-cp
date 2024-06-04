package org.example.lvl1;

import java.util.Scanner;

public class StonesOnTheTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        String str = sc.next();


        int counter = 0;

        for(int i = 1 ; i < len ; i++){

            if(str.charAt(i-1) == str.charAt(i) ) counter++;
        }

        System.out.println(counter);

    }
}
