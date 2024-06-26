package org.example.lvl1;

import java.util.Scanner;

public class HowMuchDoesDaytonaCost {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();
            int k = sc.nextInt();
            int flag = 0;

            for(int i = 0 ; i < n ; i++){

                if( k == sc.nextInt()){
                    flag = 1;
                }
            }
            System.out.println(flag == 1 ? "YES" : "NO");


        }

    }
}
