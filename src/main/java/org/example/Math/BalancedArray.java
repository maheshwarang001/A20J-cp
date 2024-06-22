package org.example.Math;

import java.util.Scanner;

public class BalancedArray {

        public static void main(String[] args) {

            Scanner sc =  new Scanner(System.in);
            solveT(sc);

        }
        public static void solveT(Scanner sc){

            int t = sc.nextInt();

            while (t-- > 0){

                int n = sc.nextInt();

                if( n  % 4 != 0){
                    System.out.println("NO");
                }else{

                    System.out.println("YES");
                    int sum1 = 0;
                    int sum2 = 0;

                    for(int i = 2 ; i <= n ; i+=2){
                        System.out.print(i + " ");
                        sum1+=i;
                    }
                    for(int i = 1 ; i < n-2 ; i+=2){
                        System.out.print(i + " ");
                        sum2+=i;
                    }
                    System.out.print(Math.abs(sum2-sum1));
                    System.out.println();
                }


            }

        }

        public static void solve(Scanner sc){



        }


}
