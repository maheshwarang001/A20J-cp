package org.example.lvl1;

import java.util.Arrays;
import java.util.Scanner;

public class PermutationSwap {
    static long gcd(long a, long b){

        while(b != 0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();

            int ans = 0;

            for(int i = 1 ; i <= n ; i++){
                int c = sc.nextInt();
                if(Math.abs(c-i) != 0){
                    ans  = (int) gcd(ans, Math.abs(c-i));
                }

            }
            System.out.println(ans);


        }

    }

}
