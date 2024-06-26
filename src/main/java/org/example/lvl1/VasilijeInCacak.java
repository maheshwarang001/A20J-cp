package org.example.lvl1;

import java.util.Scanner;

public class VasilijeInCacak {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            long n = sc.nextInt();
            long k = sc.nextInt();
            long x = sc.nextLong();

            long low  = k * (k+1)/2;

            long high = (n*(n+1))/2 - ((n-k)*(n-k+1))/2;

            if(x >= low && x <= high){
                System.out.println("YES");
            }else System.out.println("NO");


        }

    }
}
