package org.example.lvl1;

import java.util.Arrays;
import java.util.Scanner;

public class MainakAndArray {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        solveT(sc);


    }
    public static void solveT(Scanner sc){

        int t = sc.nextInt();

        while (t-- > 0){

            int n = sc.nextInt();

            int [] a = new int[n];


            int ans= 0;

            for(int i  = 0; i< n ; i++){
                a[i] = sc.nextInt();
            }

            ans = Math.max(ans, a[n-1] - a[0]);

            //i+1 - n-1 rotations

            for(int i  = 0; i < n ; i++){
                ans=Math.max(ans, a[i]-a[0]);
                ans=Math.max(ans, a[n-1]-a[i]);

                ans=Math.max(ans, a[i]-a[(i+1)%n]);
            }
            System.out.println(ans);






        }

    }

}
