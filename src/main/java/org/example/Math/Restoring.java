package org.example.Math;

import java.util.Arrays;
import java.util.Scanner;

public class Restoring {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solve(sc);

    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            int [] arr=  new int[4];

            for(int i = 0 ; i < 4 ; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);



            for(int i = 0 ; i < 3 ; i++){
                int ans = arr[3] - arr[i];
                System.out.println(ans);
                System.out.print(ans + " ");
            }



        }

    }

    public static void solve(Scanner sc){

        int [] arr=  new int[4];

        for(int i = 0 ; i < 4 ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);



        for(int i = 0 ; i < 3 ; i++){
            int ans = arr[3] - arr[i];

            System.out.print(ans + " ");
        }



    }
}

