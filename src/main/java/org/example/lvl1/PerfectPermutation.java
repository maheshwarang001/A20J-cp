package org.example.lvl1;

import java.util.Scanner;

public class PerfectPermutation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n % 2 == 1){
            System.out.print(-1);
        }
        else{

            System.out.print("2 1 ");

            for(int i = 3 ; i <= n ; i+=2){
                System.out.print(i+1 + " " + i + " ");
            }
        }
    }
}
