package org.example.numberTheory;

import java.util.Scanner;

public class div {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();
            int k = sc.nextInt();
            long prod = 1;

            int[] arr = new int[n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
                prod *= arr[i];
            }

            if(2023 % prod != 0){
                System.out.println("NO");
            }else{

                System.out.println("YES");

                for(int i = 0 ; i < k ; i++){
                    if(i== 0){
                        System.out.print(2023/prod + " ");
                    }
                    else System.out.print(1 + " ");
                }
            }

        }

    }

    public static void solve(Scanner sc){


    }
}
