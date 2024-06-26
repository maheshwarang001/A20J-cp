package org.example.lvl1;

import java.util.Scanner;

public class DonTryToCount {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();
            int m = sc.nextInt();

            String x = sc.next();
            String y = sc.next();

            int level = 0;
            for(int i = 0 ; i < 5 ; i++){

                if(!x.contains(y)){
                    level++;
                    x = x + x;
                }
            }
            if(!x.contains(y)) System.out.println(-1);
            else System.out.println(level);
        }

    }
}
