package org.example.Math;

import java.util.Scanner;

public class EvenArray {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);

    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();
            int odd = 0;
            int even = 0;

            for(int i = 0 ; i < n ; i++){

                int x = sc.nextInt();
                if( i % 2 != x % 2) {
                    if (x % 2 != 0) odd++;
                    else even++;
                }
            }

            if (even == odd){
                System.out.println(odd);
            }else {
                System.out.println(-1);
            }
        }

    }

    public static void solve(Scanner sc){
    }
}
