package org.example.lvl1;

import java.util.Scanner;

public class PetrAndBook {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pages = sc.nextInt();

        int[] weeks = new int[7];

        for(int i = 0 ; i < 7 ; i++) weeks[i] = sc.nextInt();

        int sum = weeks[0];


        int i = 0;

        while(sum < pages){

            i++;
            i%=7;

            sum+=weeks[i];
        }

        System.out.println(i+1);



    }
}
