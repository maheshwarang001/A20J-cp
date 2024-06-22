package org.example.bit;

import java.util.Scanner;

public class XorMixup {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int x = sc.nextInt();
            int ans[] = new int[x];
            for(int i = 0 ; i < x ; i++){
                ans [i]= sc.nextInt();
            }

            System.out.println(ans[0]);
        }
    }

}
